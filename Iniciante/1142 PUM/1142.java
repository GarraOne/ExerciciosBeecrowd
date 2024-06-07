import java.util.Scanner;
public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int P  = 1, N = sc.nextInt();
        for(int I = 1; I<= N; I++ ,P = P + 4 )
        {
            int P1 = P + 1;
            int P2 = P + 2;
            System.out.println(P + " " +P1+ " " +P2+ " PUM");
        }
    }
}
