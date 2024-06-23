import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double X = sc.nextDouble(), Y = sc.nextDouble(),
        D = X*Y/12;
        System.out.println(String.format("%.3f",D ));
    }
}
