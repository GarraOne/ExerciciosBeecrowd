import java.io.IOException;
import java.util.Scanner;

public class Main {

 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();      
        double B = sc.nextDouble();      
        double C = sc.nextDouble();
        double a1 =  Math.abs(B - C) ;
        double a2 =(B + C);
        double b1 = Math.abs(A - C);
        double b2 =(A+ C);
        double c1 =Math.abs( A -B );
        double c2 =(A + B);
      
        if (a1<A  &&  A<a2  &&  b1<B  &&  B<b2  &&  c1<C  &&  C<c2)
        
    {
        double T = A+B+C ;
        System.out.println(String.format("Perimetro = %.1f" , T)); 
    }
    
    else
    {
        
        double Q = ((A+B)*C)/2;    
        
        System.out.println(String.format("Area = %.1f" , Q));
        

        }
        
    }
    
}
    
