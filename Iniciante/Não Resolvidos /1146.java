// Código ainda não finalizado
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 1, I;
        String S;
        while(N > 0)
        {
            I = 1;
            S = "";
            N = sc.nextInt();
            
            while(I <= N)
            {
                S = S + I;
                
                I++;
                
                S = S + " ";
            }
            
            System.out.println(S + "");
        }
    }
}
