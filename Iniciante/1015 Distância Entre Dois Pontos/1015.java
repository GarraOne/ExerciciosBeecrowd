import java.io.IOException;
import java.util.Scanner;

public class Main {

 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double X = sc.nextDouble();
        double Y = sc.nextDouble();
        double XX = sc.nextDouble();
        double YY = sc.nextDouble();
        double D = Math.sqrt((Math.pow((XX-X),2)) + (Math.pow((YY-Y), 2)))  ;
        System.out.println(String.format("%.4f",D ));
    }
    
}
