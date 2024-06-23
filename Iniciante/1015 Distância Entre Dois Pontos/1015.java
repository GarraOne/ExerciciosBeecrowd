import java.util.Scanner;
public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        double X = sc.nextDouble(), Y = sc.nextDouble(),
        XX = sc.nextDouble(), YY = sc.nextDouble(),
        D = Math.sqrt((Math.pow((XX-X),2)) + (Math.pow((YY-Y), 2)))  ;
        System.out.println(String.format("%.4f",D ));
    }
}
