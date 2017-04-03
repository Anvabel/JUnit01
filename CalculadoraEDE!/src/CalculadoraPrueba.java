import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraPrueba {

	Calculadora C1;
	
	@Before
	public void create()
	{
		this.C1 = new Calculadora();
	}
	
	@Test
	public void sumarTest() {
		
		
		float resultado = C1.sumar(2, 4);
		System.out.println("2 + 4 = " + resultado);
		assertEquals("Método sumarTest",6.0 ,resultado, 0);
		
	}

	@Test
	public void restarTest()
	{
		
		float resultado = C1.restar(4, 1);
		System.out.println("4 - 1 = "+resultado);
		assertEquals("Método sumarTest",3.0 ,resultado, 0);
	}
	
	@Test
	public void multiplicarTest()
	{
		
		float resultado = C1.multiplicar(4, 2);
		System.out.println("4 * 2 = "+resultado);
		assertEquals("Método sumarTest",8.0 ,resultado, 0);
	}
	
	@Test
	public void dividirTest()
	{
	
		float resultado = C1.dividir(8, 2);
		System.out.println("8 / 2 = "+resultado);
		assertEquals("Método sumarTest",4.0 ,resultado, 0);
	}
}
