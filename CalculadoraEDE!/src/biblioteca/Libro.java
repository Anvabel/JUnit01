package biblioteca;

//Definimos que Libro heredar� de Publicaci�n.
public class Libro extends Publicacion {
	
	private String tematica;
//Definimos el constructor vac�o del padre en el del libro.
	public Libro(){
		super();
		this.tematica = "";
			
	}
/*Como libro hereda de Publicaci�n comparte sus atributos y metodos
   los cuales se los pasaremos por el constructor del padre.*/
	public Libro(long ISBN, String Titulo, int numPaginas, String tematica){
		super(ISBN, Titulo, numPaginas);
		this.tematica = tematica;
	
	}

/*De aqui en adelante est�n los m�todos para definir y mostrar la tem�tica
del libro.*/
	public void setTematica(String Tematica){
		
		this.tematica = Tematica;
	}
	public String getTematica(){
		return this.tematica;
	}
	@Override	/*Metodo que sobreescribe el de publicaci�n, muestra
	los datos del libro.*/
	public String toString(){
		
		return super.toString()+"\nTem�tica: "+this.tematica;
	}
	
}
	

