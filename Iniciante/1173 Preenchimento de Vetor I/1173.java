import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int I , E = sc.nextInt(), N = 0;
        int X[ ] = new int[10];
        
        for(I = 0; I < 10; I++, N++)
        {
            X[I]= E ;
            E = E*2;
            System.out.println("N["+N+"] = "+X[I]);
        }
    }
}
