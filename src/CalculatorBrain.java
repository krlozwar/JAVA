import java.util.Scanner;

public class CalculatorBrain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int a= 0, b = 0;
		System.out.println("Ingresa el numero de la operacion que quieres realizar:\n"
				+ "1.- Suma\n"
				+ "2.- Resta\n"
				+ "3.- Multiplicacion\n"
				+ "4.- División\n"
				+ "5.- Potencia\n"
				+ "6.- Raíz cuadrada\n");
		int op = leer.nextInt();
		
		if(op!=6) {
			System.out.println("Ingresa un numero:");
		    a = leer.nextInt();
			System.out.println("Ingresa un segundo numeto:");
			b = leer.nextInt();
		}
		
		if(op==6) {
			System.out.println("Ingresa un numero: ");
			a = leer.nextInt();
		}
		
		
		switch(op) {
			case 1:
				System.out.println("la suma de "+a+" + "+b+" es: "+suma(a,b));
				break;
			case 2:
				System.out.println("la resta de "+a+" - "+b+" es: "+resta(a,b));
				break;
			case 3:
				System.out.println("la multiplicación de "+a+" X "+b+" es: "+multiplicacion(a,b));
				break;
			case 4:
				System.out.println("la division de "+a+" / "+b+" es: "+division(a,b));
				break;
			case 5:
				System.out.println(a+" elevado a la potencia "+b+" es: "+potencia(a,b));
				break;
			case 6:
				System.out.println("La raíz cuadrada de "+a+" es: "+raizCuadrada(a));
				break;
			default:
				System.out.println("Operacion no valida");
				break;
					
		}
		
		leer.close();
		
	}
	
	public static int suma(int a, int b) {
		return (a+b);
	}
	
	public static int resta(int a, int b) {
		return (a-b);
	}
	
	public static int multiplicacion(int a, int b) {
		return (a*b);
	}
	
	public static double division(double a, double b) {
		return (a/b);
	}
	
	public static double potencia(int a, int b) {
		return (Math.pow(a, b));
	}
	
	public static double raizCuadrada(int a) {
		return (Math.sqrt(a));
	}
	
	
	
}
