import java.util.Scanner;

public class questaoQuatro {
	
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
			Scanner digito = new Scanner(System.in);
			while (true) {
				double e = 1;
				System.out.println("digite numero de termos ou 0 para sair: ");
				num = digito.nextInt();
				if (num == 0) {
					break;
				}
				System.out.println("calculando constante e: ");
				if (num == 1) {
					System.out.println("resultado de e: " + e);
				}
				else {
					for (int i = 1; i < num ; i++) {
						e = e + (1/fatorial(i));
					}
					System.out.println("resultado de e: " + e);
				}
			}
		}
}
