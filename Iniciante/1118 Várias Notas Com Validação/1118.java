import java.util.Scanner;
public class Main {
    public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		double N1, N2, D = 1, M;
		while (D == 1) {
			
			N1 = sc.nextDouble();
			while (N1 > 10 || N1 < 0) 
			{
				System.out.println("nota invalida");
				N1 = sc.nextDouble();
			}
			
			N2 = sc.nextDouble();
			while (N2 > 10 || N2 < 0)
			{
				System.out.println("nota invalida");
				N2 = sc.nextDouble();
			}
			
			    M = (N2 + N1)/2;
			
			System.out.println(String.format("media = %.2f", M));
			System.out.println("novo calculo (1-sim 2-nao)");
			
			D = sc.nextInt();
			
			while (D != 1 && D != 2) 
			{
				System.out.println("novo calculo (1-sim 2-nao)");
				D = sc.nextInt();
			}
		}
    }
}
