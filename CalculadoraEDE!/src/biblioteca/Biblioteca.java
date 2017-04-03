package biblioteca;
import java.util.*;

public class Biblioteca {
	//variables est�ticas, junto al arrayList est�tico al cual le asignaremos m�s adelante los valores.
	static int numLibros;
	static int numLibrosLeidos;
	static ArrayList <Publicacion> listaPublicaciones = new ArrayList <>();
	
	public static void asignaPublicacion()
	{
		String pregunta = "";
		//Variables que utilizaremos para guardar los valores pasados por teclado
		Scanner teclea = new Scanner(System.in);
		
		//Bucle para pedir el tipo de objeto, junto con los elementos espec�ficos a cada uno.
		for(int i = 0;i!=1;)
		{
			//Se realiza la llamada a los m�todos y se les pasa objetos an�nimos
			System.out.println("Introduce el tipo de publicaci�n, introduce \"salir\" para salir");
			pregunta = teclea.nextLine();
			//Con la pregunta se decide qu� tipo de objeto an�nimo se pasar�
			if(pregunta.toUpperCase().equals("LIBRO"))
			{//Se introduce el objeto de retorno dentro del arraylist
				listaPublicaciones.add(AsignaTipo(new Libro()));
			}
			else if(pregunta.toUpperCase().equals("COMIC"))
			{//Se introduce el objeto de retorno dentro del arraylist
				listaPublicaciones.add(AsignaTipo(new Comic()));
			}
			else if(pregunta.toUpperCase().equals("SALIR"))
			{
				i = 1;
			}
			
		}
		teclea.close();
	}
	//Metodo para mostrar los datos de los comics
	public static void infoComics()
	{
		
		for(int i = 0;i<listaPublicaciones.size();i++)
		{
			
			if(listaPublicaciones.get(i) instanceof Comic)
			{
				System.out.println(listaPublicaciones.get(i).toString()+"\n");
			}
			
		}
		
	}
	//Metodo para mostrar los valores espec�ficos de los libros.
	public static void infoLibros()
	{
		
		for(int i = 0;i<listaPublicaciones.size();i++)
		{
			
			if(listaPublicaciones.get(i) instanceof Libro)
			{
				System.out.println(listaPublicaciones.get(i).toString()+"\n");
			}
			
		}
		
	}
	//Dependiendo del tipo de objeto que se pase se piden datos y se asignan a un objeto
	public static Publicacion AsignaTipo(Publicacion p)
	{
		Scanner teclea = new Scanner(System.in);
		String texto="";
		int numero=0;
		if(p instanceof Libro)
		{
			System.out.println("Introduce la tem�tica.");
			texto = teclea.nextLine();
			((Libro)p).setTematica(texto);
			System.out.println("Introduce el T�tulo");
			texto = teclea.nextLine();
			((Libro)p).setTitulo(texto);
			System.out.println("Introduce el n�mero de ISBN");
			numero = teclea.nextInt();
			((Libro)p).setISBN(numero);
			System.out.println("Introduce el n�mero de p�ginas");
			numero = teclea.nextInt();
			((Libro)p).setNumPag(numero);
		}
		else if(p instanceof Comic)
		{
			System.out.println("Introduce el t�tulo.");
			texto = teclea.nextLine();
			((Comic)p).setTitulo(texto);
			System.out.println("Introduce el ilustrador.");
			numero = teclea.nextInt();
			((Comic)p).setIlustrador(numero);
			System.out.println("Introduce el n�mero de ISBN.");
			numero = teclea.nextInt();
			((Comic)p).setISBN(numero);
			System.out.println("Introduce el n�mero de p�gina.");
			numero = teclea.nextInt();
			((Comic)p).setNumPag(numero);
		}
		//Se devuelve el objeto con los valores definidos, introduci�ndolo en el arrayList
		return p;
		
	}
	
}
