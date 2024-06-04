import java.util.Scanner;
public class Main {
    public static void main(String[] args)  {
        int J =7, I = 1;
        
        for( I = 1; I <= 9 ;   I = I + 2 , J = J + 2 )
        {
            int J1 = J-1, J2 = J-2;

    System.out.println("I=" + I + " J=" + J );
    System.out.println("I=" + I + " J=" + J1 );
    System.out.println("I=" + I + " J=" + J2 );
            
        }
    }
}
