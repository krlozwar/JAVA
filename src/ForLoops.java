import java.util.Scanner;

public class ForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		String nombre;
		
		System.out.println("Ingresa un nombre");
		nombre = leer.nextLine();
		
		for (int i = 0; i < nombre.length(); i++) {
			System.out.println(" * "+nombre.charAt(i));
		}
	}

}
