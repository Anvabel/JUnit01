package biblioteca;
public class Comic extends Publicacion{
	
	Libro b;
	
	private int ilustrador;
	
/*Esta clase es muy similar a la clase Libro, lo unico que cambia es 
  el atributo Ilustrador, el cual será pasado junto al constructor o
  mediante el setIlustrador*/
	public Comic(){
		super();
		this.ilustrador = 0;
		
	}
	public Comic(long ISBN, String Titulo, int numPaginas, int ilustrador){
	super(ISBN, Titulo, numPaginas);
	this.ilustrador = ilustrador;
	}
	
	public void setIlustrador(int Ilustrador){
		
		this.ilustrador = Ilustrador;
	}
	
	public int getIlustrador(){
		return this.ilustrador;
	}
	
//Al igual que en libro, aqui se sobreescribe el metodo toString de la clase
//padre y añade la nueva informacion.
	public String toString(){
		
		return super.toString()+"\nIlustrador: "+ilustrador;
	}
}
