import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        double  N1, N2, N3, N4, N5, N6 ;
         N1 = sc.nextDouble();
         N2 = sc.nextDouble();
         N3 = sc.nextDouble();
         N4 = sc.nextDouble();
         N5 = sc.nextDouble();
         N6 = sc.nextDouble();
        int I = 0;
        
        if (N1 > 0 ) I++ ;
        if (N2 > 0 ) I++ ;
        if (N3 > 0 ) I++ ;
        if (N4 > 0 ) I++ ;
        if (N5 > 0 ) I++ ;
        if (N6 > 0 ) I++ ;
        
        {
            System.out.println(I + " valores positivos");
            
        }
    }
}
