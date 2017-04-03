package biblioteca;
import java.util.*;

public class Biblioteca {
	//variables estáticas, junto al arrayList estático al cual le asignaremos más adelante los valores.
	static int numLibros;
	static int numLibrosLeidos;
	static ArrayList <Publicacion> listaPublicaciones = new ArrayList <>();
	
	public static void asignaPublicacion()
	{
		String pregunta = "";
		//Variables que utilizaremos para guardar los valores pasados por teclado
		Scanner teclea = new Scanner(System.in);
		
		//Bucle para pedir el tipo de objeto, junto con los elementos específicos a cada uno.
		for(int i = 0;i!=1;)
		{
			//Se realiza la llamada a los métodos y se les pasa objetos anónimos
			System.out.println("Introduce el tipo de publicación, introduce \"salir\" para salir");
			pregunta = teclea.nextLine();
			//Con la pregunta se decide qué tipo de objeto anónimo se pasará
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
	//Metodo para mostrar los valores específicos de los libros.
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
			System.out.println("Introduce la temática.");
			texto = teclea.nextLine();
			((Libro)p).setTematica(texto);
			System.out.println("Introduce el Título");
			texto = teclea.nextLine();
			((Libro)p).setTitulo(texto);
			System.out.println("Introduce el número de ISBN");
			numero = teclea.nextInt();
			((Libro)p).setISBN(numero);
			System.out.println("Introduce el número de páginas");
			numero = teclea.nextInt();
			((Libro)p).setNumPag(numero);
		}
		else if(p instanceof Comic)
		{
			System.out.println("Introduce el título.");
			texto = teclea.nextLine();
			((Comic)p).setTitulo(texto);
			System.out.println("Introduce el ilustrador.");
			numero = teclea.nextInt();
			((Comic)p).setIlustrador(numero);
			System.out.println("Introduce el número de ISBN.");
			numero = teclea.nextInt();
			((Comic)p).setISBN(numero);
			System.out.println("Introduce el número de página.");
			numero = teclea.nextInt();
			((Comic)p).setNumPag(numero);
		}
		//Se devuelve el objeto con los valores definidos, introduciéndolo en el arrayList
		return p;
		
	}
	
}
