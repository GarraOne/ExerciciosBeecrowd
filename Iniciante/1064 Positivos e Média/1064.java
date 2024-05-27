import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        double  N1, N2, N3, N4, N5, N6, O ;
         N1 = sc.nextDouble();
         N2 = sc.nextDouble();
         N3 = sc.nextDouble();
         N4 = sc.nextDouble();
         N5 = sc.nextDouble();
         N6 = sc.nextDouble();
         
        int I = 0;
         O = 0;
        
        if (N1 > 0 ) {I++ ; O = O + N1; }
        if (N2 > 0 ) {I++ ; O = O + N2; } 
        if (N3 > 0 ) {I++ ; O = O + N3; }
        if (N4 > 0 ) {I++ ; O = O + N4; }
        if (N5 > 0 ) {I++ ; O = O + N5; }
        if (N6 > 0 ) {I++ ; O = O + N6; }
        
        {
            O = O/I;
            System.out.println(I + " valores positivos");
            System.out.println(String.format("%.1f" , O));
        }
    }
}
