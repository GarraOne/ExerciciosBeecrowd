import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble(), B = sc.nextDouble(),
        AA = A*3.5 , BB = B*7.5, X = (AA+BB)/11 ;
        System.out.println(String.format("MEDIA = %.5f", X));
    }
}
