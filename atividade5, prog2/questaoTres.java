import java.util.ArrayList;

public class questaoTres {
	

	@SuppressWarnings("resource")
	public static void main(String args[]) throws Exception
	{
		ArrayList<Double> valores = new ArrayList<Double>();
		valores.add(1.55);
		valores.add(1.70);
		valores.add(1.80);
		
		double med = 0;

		System.out.println("testando ");

		System.out.println("calculando m�dia: ");
		for (int i = 0; i < valores.size() ; i++) {
			med = med + valores.get(i);
		}
		med = med / valores.size();
		System.out.printf("m�dia: %.6f", med);
		
		double dp = 0;
		
		System.out.println("calculando desvio padr�o: ");
		for (int i = 0; i < valores.size() ; i++) {
			dp = dp + (valores.get(i) - med) * (valores.get(i) - med);
		}
		dp = dp/valores.size();
		dp = Math.sqrt(dp);
		System.out.printf("desvio padr�o: %.6f ",  dp);
	}
}
