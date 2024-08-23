import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int E = 0, I = 0 , N = 0,
        X[ ] = new int[21];
        while( I < 20 ) {
            I++;
            E = sc.nextInt();
            X[I]= E;
        }
        while(N >= 0 ){
            System.out.println("N["+N+"] = "+ X[I]);
            if (I == 1) N = -2;
            I--; N++;
        }
    }
}
