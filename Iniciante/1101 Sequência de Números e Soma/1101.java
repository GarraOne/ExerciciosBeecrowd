import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int M, N ;
        Scanner sc = new Scanner(System.in);
        while((M = sc.nextInt()) > 0 && (N = sc.nextInt()) > 0)
        {
            int S = 0 ;
            if (M < N)
            {
                for (M = M; M <= N; M++)
                {
                    S+=M;
                    System.out.print(M + " ");
                }
            }
            else
            {
                for (N = N; N <= M; N++)
                {
                    S+=N;
                    System.out.print(N + " ");
                }
            }
            System.out.print("Sum="+S+"\n");
        }
    }
}
