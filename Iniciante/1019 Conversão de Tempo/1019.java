import java.util.Scanner;
public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt(), 
        A = X/3600 ,
        B = (X - (A*3600))/60, 
        C = (X -( A*3600 + B*60));
        System.out.println(A +":"+ B +":"+ C);
    }
}
