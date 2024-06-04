import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner leitor = new Scanner(System.in);
    	int X, Y, S, N = leitor.nextInt();
    	for (int i = 0; i < N; i++) {
    		S = 0;
    		X = leitor.nextInt();
    		Y = leitor.nextInt();
    		
    		if (Y > X) {
	    		for (int j = X+1; j < Y; j++) {
	    			if (j % 2 != 0) S += j;
	    		}
    		} else {
	    		for (int j = Y+1; j < X; j++) {
	    			if (j % 2 != 0) S += j;
	    		}
    		}
    		System.out.println(S);
    	}
    }
	
}
