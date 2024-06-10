import java.util.Scanner;
public class Main {
    public static void main(String[] args)  {
    	Scanner sc = new Scanner(System.in);
		int XX = sc.nextInt(), YY = sc.nextInt(), S = 0, I = 0, X, Y;
		if (XX < YY){ X = XX; Y = YY;}
		else { X = YY; Y = XX; }
		I = X;
		if(I%2 == 0) {I++;}
		else {S = S - I;}
		
		while(I < Y)
		{
		        S = S + I;
		        I = I + 2;
		}
		System.out.println(S);
    }
}
