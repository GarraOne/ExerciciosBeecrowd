import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double E = 0;
        int I;
        double X[ ] = new double[100];
        for(I = 0; I < 100; I++) 
        {
            E = sc.nextDouble();
            X[I]= E;
        }
        for (I = 0;I>-1;I++ )
        {
            if (X[I]<= 10)System.out.println(String.format("A["+I+"] = %.1f", X[I]));
            if (I == 99) I = -2;
        }
    }
}
