import java.io.IOException;
import java.util.Scanner;

public class Main {

 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double X = (4.0/3)*3.14159*A*A*A;
        System.out.println(String.format("VOLUME = %.3f", X));
    }
    
}
