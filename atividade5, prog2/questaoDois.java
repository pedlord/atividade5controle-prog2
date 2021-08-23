import java.util.Scanner;

public class questaoDois {
	@SuppressWarnings("resource")
	public static void main(String args[]) throws Exception
	{
		int num;
		Scanner digito = new Scanner(System.in);
		while (true) {
			System.out.println("digite o numero inteiro positivo para descobrir seu fatorial ou um numero negativo para sair: ");
			num = digito.nextInt();
			int fat = 1;
			if (num < 0) {
				break;
			}
			else if(num == 0) {
				System.out.println("fatorial: " + fat);
			}
			else {
				for (int i = 1; i <= num ; i++) {
					fat = fat * i;
				}
				System.out.println("fatorial: " + fat);
			}
		}
	}
}
