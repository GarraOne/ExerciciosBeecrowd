import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble(), B = sc.nextDouble(), C = sc.nextDouble(),
        AA = A*2, BB = B*3, CC = C*5,
        X = (AA+BB+CC)/10;
        System.out.println(String.format("MEDIA = %.1f", X));
    }
}
