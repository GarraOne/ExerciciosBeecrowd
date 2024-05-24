import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int hI = sc.nextInt();
		int mI = sc.nextInt();
		int hF = sc.nextInt();
		int mF = sc.nextInt();
		int tH = hFim - hInicio;
		int tM = mFim - mInicio;
		
		if (tH < 0) {
			tH = 24 + (hF - hI);
		}
		
		if (tM < 0) {
			tM = 60 + (mF - mI);
			tH--;
		}
		
		if (hI == hF && mI == mF) System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		else if (tH == -1) System.out.println("O JOGO DUROU "+ 23 + " HORA(S) E " + tM + " MINUTO(S)");
		else System.out.println("O JOGO DUROU "+ tH + " HORA(S) E " + tM + " MINUTO(S)");
	}
	
}
