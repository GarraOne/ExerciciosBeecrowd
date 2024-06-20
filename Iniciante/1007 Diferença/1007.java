import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble(), B = sc.nextDouble(), C = sc.nextDouble(), D = sc.nextDouble(),
        AB = A*B , CD = C*D, X = AB-CD;
        System.out.println(String.format("DIFERENCA = %.0f", X));
    }
}
