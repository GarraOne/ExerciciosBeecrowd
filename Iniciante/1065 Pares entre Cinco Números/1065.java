import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        double  N1, N2, N3, N4, N5 ;
         N1 = sc.nextDouble();
         N2 = sc.nextDouble();
         N3 = sc.nextDouble();
         N4 = sc.nextDouble();
         N5 = sc.nextDouble();
        int I = 0;
        
        if (N1 %2==0  ) I++ ;
        if (N2 %2==0  ) I++ ;
        if (N3 %2==0  ) I++ ;
        if (N4 %2==0  ) I++ ;
        if (N5 %2==0  ) I++ ;

        {
            System.out.println(I + " valores pares");
            
        }
    }
}
