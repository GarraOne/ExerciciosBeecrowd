import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble(), B = sc.nextDouble(), C = sc.nextDouble(),
        X = B*C ,
        AA = sc.nextDouble(), BB = sc.nextDouble(), CC = sc.nextDouble(),
        V = BB*CC,
        T = V + X;
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", T));
    }
}
