
public class CalculadoraDemo {

	public static void main(String[] args) {
		
		Calculadora C1 = new Calculadora();
		
		int num1 = 5;
		int num2 = 5;
		
		
		System.out.println("5 - 5 = "+C1.restar(num1, num2));
		System.out.println("5 + 5 = "+C1.sumar(num1, num2));
		System.out.println("5 * 5 = "+C1.multiplicar(num1, num2));
		System.out.println("5 / 5 = "+C1.dividir(num1, num2));
		
		
	}
}
