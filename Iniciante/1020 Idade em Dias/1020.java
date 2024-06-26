import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt(), A = X/365,
         B = (X-(A*365))/30, C = X-(A*365+ B*30);
         System.out.println( A+ " ano(s)");
         System.out.println( B+ " mes(es)");
         System.out.println( C+ " dia(s)");
    }
}
