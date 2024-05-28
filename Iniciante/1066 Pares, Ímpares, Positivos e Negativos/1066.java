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

        int I = 0;
        int II = 0;
        int IP = 0;

        
        if (N1 > 0 ) I++ ;
        if (N2 > 0 ) I++ ;
        if (N3 > 0 ) I++ ;
        if (N4 > 0 ) I++ ;
        if (N5 > 0 ) I++ ;

        if (N1 < 0 ) II++ ;
        if (N2 < 0 ) II++ ;
        if (N3 < 0 ) II++ ;
        if (N4 < 0 ) II++ ;
        if (N5 < 0 ) II++ ;
        
        if (N1 %2==0  ) IP++ ;
        if (N2 %2==0  ) IP++ ;
        if (N3 %2==0  ) IP++ ;
        if (N4 %2==0  ) IP++ ;
        if (N5 %2==0  ) IP++ ;
        
        int III = 5 - IP; 

        {
            System.out.println(IP +" valor(es) par(es)");
            System.out.println(III +" valor(es) impar(es)");
            System.out.println(I + " valor(es) positivo(s)");
            System.out.println(II + " valor(es) negativo(s)");

        }
    }
}
