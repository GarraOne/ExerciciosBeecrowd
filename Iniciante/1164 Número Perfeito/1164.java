import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int O = sc.nextInt(), X , I, M, S;
        while (O>0)
        {
         X = sc.nextInt();
         M = X;
         I = 1;
         S = 0;
         X--;
       while ( X>0 )
        {          
          if (M%I == 0) {S = S + I;}
           X--; I++;
        }
        if (M==S ) {System.out.println(S + " eh perfeito");}
        else {System.out.println(M + " nao eh perfeito");}
        O--;
        }
    }
}
