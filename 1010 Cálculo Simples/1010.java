import java.io.IOException;
import java.util.Scanner;

public class Main {

 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double X = B*C ;
        double AA = sc.nextDouble();
        double BB = sc.nextDouble();
        double CC = sc.nextDouble();
        double V = BB*CC ;
        double T = V + X ;
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", T));
    }
    
}
