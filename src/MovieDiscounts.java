import java.util.Scanner;

public class MovieDiscounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		int edad;
		double precio;
		double descuento;
		int cantidad;
		
		System.out.print("Ingrese la edad del cliente: ");
		edad = leer.nextInt();
		System.out.print("Ingrese el precio del ticket: ");
		precio = leer.nextDouble();
		System.out.println("Ingrese la cantidad de boletos: ");
		cantidad = leer.nextInt();
		
		if(edad<5) {
			descuento = precio*.6;
		}else if(edad>60) {
			descuento =precio*.55;
		}else {
			descuento = 0;
			if(cantidad>1) {
				descuento = (precio*cantidad)*.3;
				precio*=cantidad;
			}
		}
		
		System.out.println("Precio de tu boleto sera de: " + (precio-descuento));
	}

}
