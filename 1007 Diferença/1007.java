import java.io.IOException;
import java.util.Scanner;

public class Main {

 
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double D = sc.nextDouble();
        double AB = A*B ;
        double CD = C*D ;
        double X = AB-CD ;
        System.out.println(String.format("DIFERENCA = %.0f", X));
        
    }
}
