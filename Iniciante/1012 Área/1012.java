import java.io.IOException;
import java.util.Scanner;

public class Main {

 
    public static void main(String[] args) throws IOException {
   
        Scanner sc = new Scanner(System.in);
        
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        
        double T = (A*C)/2 ;
        
        double CC = C*C*3.14159 ;
        
        double TT =((A+B)*C)/2;
        
        double Q = B*B;
        
        double R = A*B;
        
        
        System.out.println(String.format("TRIANGULO: %.3f", T ));
        System.out.println(String.format("CIRCULO: %.3f", CC ));
        System.out.println(String.format("TRAPEZIO: %.3f", TT ));
        System.out.println(String.format("QUADRADO: %.3f", Q ));
        System.out.println(String.format("RETANGULO: %.3f", R ));
        
        
    }
    
}
