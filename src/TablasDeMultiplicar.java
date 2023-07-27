import java.util.Scanner;

public class TablasDeMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
        int num;
        int cont=1;
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
                
        System.out.println("Multiplication Table of " + num);
        
        while(cont<=10) {
        	System.out.println(cont+" X "+num+" = "+(cont*num));
        	cont++;
        }
	}

}
