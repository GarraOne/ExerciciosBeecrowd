import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double A = sc.nextDouble(), B = sc.nextDouble(),
        X = A*B ;
        System.out.println("NUMBER = " + N);
        System.out.println(String.format("SALARY = U$ %.2f", X));
    }
}
