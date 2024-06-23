import java.util.Scanner;
public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble(), B = sc.nextDouble(), X = A/B;
        System.out.println(String.format("%.3f km/l",X ));
    }
}
