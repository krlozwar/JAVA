
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numAnt=0;
		int numAct=1;
		int cont=0;
		int aux=0;
		System.out.println(numAnt);
		do {
						
			
			System.out.println(numAct);
			
			
			aux = numAct;
			numAct = numAct+numAnt;
			numAnt=aux;
			cont++;
			
		}while(cont<=20);
	}

}
