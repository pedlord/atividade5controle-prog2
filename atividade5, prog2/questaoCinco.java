import java.util.Scanner;

public class questaoCinco {
	public static double fatorial(double a) {
		double fat = 1;
		if (a== 0) {
			return 1;
		}
		for (int i = 1; i <= a ; i++) {
			fat = fat * i;
		}
		return fat;
		}
		
		@SuppressWarnings("resource")
		public static void main(String args[]) throws Exception
		{
			double num;
			double x;
			double exp;
			Scanner digito = new Scanner(System.in);
			while (true) {
				double e = 1;
				System.out.println("digite numero de termos ou 0 para sair: ");
				num = digito.nextInt();
				if (num == 0) {
					break;
				}
			
				System.out.println("digite o valor de x: ");
				x = digito.nextInt();
			
				exp = x;
				System.out.println("calculando constante e^x: ");
				if (num == 1) {
					System.out.println("resultado de e^x: " + e);
				}
				else {
					for (int i = 1; i < num ; i++) {
						if (i >= 3) {
							x = x * exp;
						}
						e = e + (x/fatorial(i));
					}
					System.out.println("resultado de e^x: " + e);
				}
			}
		}
}
