package biblioteca;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.*;
public class BiblioTest {

	ArrayList <Publicacion> ArPubli;
	Publicacion C1;
	
	@BeforeClass
	public void creaArray()
	{
		ArPubli = new ArrayList <>();
	}
	
	@Test
	public void introduceComicTest() 
	{
		
		ArPubli.add(new Comic(123456, "Los vengadores", 110, 784544));
		ArPubli.add(new Comic(123456, "Hulk", 110, 784544));
		ArPubli.add(new Comic(123456, "Los vengadores", 110, 784544));
		assertEquals("introduceComicTest", 3, ArPubli.size(), 0);
		
	}

}
