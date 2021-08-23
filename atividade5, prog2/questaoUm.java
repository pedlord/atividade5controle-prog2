
public class questaoUm {
	public static void main(String args[]) throws Exception
	{
		int a = 0;
		for (int i = 1; i<101; i++) {
			a = a + i;
		}
		System.out.println("soma(for): " + a);
		int num = 1;
		int b = 0;
		while (num < 101) {
			b = b + num;
			num++;
		}
		System.out.println("soma(while): " + b);
	}
}
