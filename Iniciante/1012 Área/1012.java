import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble(), B = sc.nextDouble(), C = sc.nextDouble(),
        T = (A*C)/2,
        CC = C*C*3.14159,
        TT =((A+B)*C)/2,
        Q = B*B, R = A*B;
        System.out.println(String.format("TRIANGULO: %.3f", T ));
        System.out.println(String.format("CIRCULO: %.3f", CC ));
        System.out.println(String.format("TRAPEZIO: %.3f", TT ));
        System.out.println(String.format("QUADRADO: %.3f", Q ));
        System.out.println(String.format("RETANGULO: %.3f", R ));
    }
}
