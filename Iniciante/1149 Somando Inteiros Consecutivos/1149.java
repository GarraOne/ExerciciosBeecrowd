import java.util.Scanner;
public class Main {
    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), I=0, S = 0, N = 0;
        
        while (N <= 0) 
        {
            N = sc.nextInt();
        }
        
       for (I = 0; I <= N-1; I++)
        {
            S = S + A + I;
        }
        System.out.println(S);
    }
}
