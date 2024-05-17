import java.io.IOException;
import java.util.Scanner;

public class Main {

 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double X = A+(B*0.15) ;
        System.out.println(String.format("TOTAL = R$ %.2f", X));
    }
}
