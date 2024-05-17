import java.io.IOException;
import java.util.Scanner;

public class Main {

 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double X = A/B ;
        System.out.println(String.format("%.3f km/l",X ));
    }
    
}
