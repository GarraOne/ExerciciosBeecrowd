import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int O = sc.nextInt(), X , I, M, S;
        while (O>0)
        {
         X = sc.nextInt();
         M = X;
         I = 2;
         S = 0;
         X--;
         X--;
       while ( X>0 )
        {          
          if (M%I == 0) {S--;}
           X--; I++;
        }
        if (S==0 ) {System.out.println(M + " eh primo");}
        else {System.out.println(M + " nao eh primo");}
        O--;
        }
    }
}
