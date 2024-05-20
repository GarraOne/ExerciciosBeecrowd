import java.util.Scanner;
import java.io.IOException;


public class Main {

 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        
        double D   = (B*B) - 4*A*C;
        double D2  = Math.sqrt(D);
        double R1  = (-B +D2)/(2*A) ;
        double R2  = (-B -D2)/(2*A) ;
        
        if (D <0 || (A*2 == 0)  ){
            
            
            System.out.println("Impossivel calcular");
        }
        
        else 
        {

        
        System.out.println(String.format("R1 = %.5f" , R1));
        System.out.println(String.format("R2 = %.5f" , R2));

        }
    }
}
