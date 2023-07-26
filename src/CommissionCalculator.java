import java.util.Scanner;

public class CommissionCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int sales;
		double comision;
		System.out.print("Ingrese su monto de ventas mensual: ");
		sales = leer.nextInt();
		
		if(sales>10000) {
			comision = sales*.3;
		}else if(sales>5000) {
			comision = sales*.2;
		}else if(sales>1000) {
			comision = sales*.1;
		}else {
			comision = 0;
		}
		
		System.out.println("Su comision por la ventas es de "+comision);
		leer.close();
	}

}
