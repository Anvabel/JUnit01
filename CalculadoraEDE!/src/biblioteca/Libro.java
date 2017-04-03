package biblioteca;

//Definimos que Libro heredará de Publicación.
public class Libro extends Publicacion {
	
	private String tematica;
//Definimos el constructor vacío del padre en el del libro.
	public Libro(){
		super();
		this.tematica = "";
			
	}
/*Como libro hereda de Publicación comparte sus atributos y metodos
   los cuales se los pasaremos por el constructor del padre.*/
	public Libro(long ISBN, String Titulo, int numPaginas, String tematica){
		super(ISBN, Titulo, numPaginas);
		this.tematica = tematica;
	
	}

/*De aqui en adelante están los métodos para definir y mostrar la temática
del libro.*/
	public void setTematica(String Tematica){
		
		this.tematica = Tematica;
	}
	public String getTematica(){
		return this.tematica;
	}
	@Override	/*Metodo que sobreescribe el de publicación, muestra
	los datos del libro.*/
	public String toString(){
		
		return super.toString()+"\nTemática: "+this.tematica;
	}
	
}
	

