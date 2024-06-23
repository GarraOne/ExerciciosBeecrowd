import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt(),
        AB = (A + B + Math.abs(A - B))/2,
        X = (AB + C + Math.abs(AB - C))/2 ;
        System.out.println(  X + " eh o maior" );
    }
}
