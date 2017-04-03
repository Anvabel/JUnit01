package biblioteca;


public class Publicacion {
	
	protected long ISBN;
	protected String Titulo;
	protected int numPaginas;
	protected boolean leido = false;
	
	//Creamos los constructores
	public Publicacion(){
		this.ISBN = 0;
		this.Titulo = "";
		this.numPaginas = 0;
		Biblioteca.numLibros ++;
		
	}
	/*Este constructor asigna los valores e incrementa
	 *  la cantidad de libros
	 */
	public Publicacion(long ISBN, String Titulo, int numPaginas){
		
		this.ISBN = ISBN;
		this.Titulo = Titulo;
		this.numPaginas = numPaginas;	
		Biblioteca.numLibros ++;
	}
	//De aquí en adelante se crean los setters y getters que heredarán
	//las subclases.
	public void setISBN(long ISBN){
		
		this.ISBN = ISBN;
	}
	
	public long getISBN(){
		
		return this.ISBN;
	}
	
	public void setTitulo(String Titulo){
		
		this.Titulo = Titulo;
	}
	
	public String getTitulo(){
		
		return this.Titulo;
	}
	
	public void setNumPag(int numPag){
		
		this.numPaginas = numPag;
	}
	
	public int getNumPag(){
		
		return this.numPaginas;
	}
	//Comprueba el estado del libro, si no está leido le asigna que sí, o
	//viceversa, además de añadir al contador los leidos y los totales.
	public void setLeido(boolean leer){
		if(this.leido == false && leer == true){
			this.leido = true;
			Biblioteca.numLibrosLeidos ++;
			
		}
		else if(this.leido == true && leer == false){
			this.leido = false;
			Biblioteca.numLibrosLeidos --;
			
		}
		
	}
	
	public boolean getLeido(){
		
		return this.leido;
	}
	
	/*
	 * Muestra la información referente al la publicación, este método
	 * será heredado por las subclases y sustituida, añadiendo 
	 * su información extra correspondiente.
	 */
	@Override
	public String toString(){
		
		return "ISBN: "+this.ISBN+"\nTitulo: "+this.Titulo+"\nPaginas: "+this.numPaginas;
	}
}
