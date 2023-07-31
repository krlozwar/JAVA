import java.util.Scanner;

public class MethodsEjercicio {
	 public static void main( String[] args )
	    {
	        Scanner console = new Scanner( System.in );
	        System.out.println( "Enter your name:  " );
	        String name = console.next();
	        System.out.println("enter your Last Name: ");
	        String lName = console.next();
	        printNameCharacters( name );
	        printNameLength( name );
	        console.close();
	    }

	    private static void printNameLength( String name )
	    {
	        //TODO implement this code
	    	System.out.println("Name length: "+name.length());
	    }

	    private static void printNameCharacters( String name )
	    {
	        //TODO implement this code
	    	for (int i = 0; i < name.length(); i++) {
				System.out.print(name.charAt(i)+" - ");
			}
	    }
	    
	    private static void printFullName(String name, String lName) {
	    	System.out.println(name+" "+lName);
	    }
	    
	    
}
