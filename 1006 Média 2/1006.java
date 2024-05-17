import java.io.IOException;
import java.util.Scanner;

public class Main {

 
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double AA = A*2 ;
        double BB = B*3 ;
        double CC = C*5 ;

        double X = (AA+BB+CC)/10 ;
        System.out.println(String.format("MEDIA = %.1f", X));
    }
}
