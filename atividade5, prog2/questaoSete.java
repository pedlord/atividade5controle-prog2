//import java.util.Scanner;

public class questaoSete {
	
	//@SuppressWarnings("resource")
	public static void main(String args[]) throws Exception
	{
	double num = 200000;

	double pi = 4;
	double p = 4;
	double x = 3;
	//double n;
	/*Scanner digito = new Scanner(System.in);
	System.out.println("digite numero de termos: ");
	num = digito.nextInt();*/

	System.out.println("calculando S:");
	if (num == 1) {
		System.out.printf("S: %2f , n:1",pi);
	}
	else {
		System.out.printf("S: %.5f , n:%d  | ", pi, 1);
		for (int i = 1; i < num ; i++) {
			if (i%2 == 0) {
				pi = pi + (p/x);
			}
			else {
				pi = pi - (p/x);
			}
			x = x+2;
			if (i%11 == 0) {
				System.out.printf("\nS: %.5f , n:%d | ", pi,i+1);
			}
			else {
				System.out.printf("S: %.5f , n:%d | ",pi,i+1);
				}
		}
	}
	System.out.println("\n\nO número de termos necessários para dar 3,14159 é 130658");
	}
}
