import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), X, Y, S;
       while ( N>0 )
        {       
        S = 0;   
        X = sc.nextInt();
        Y = sc.nextInt();
        while (Y>0)
        {
         if ( X%2 != 0){S=S + X;  Y--;}
         X++;
        }
        System.out.println(S);
        N--;
        }
    }
}
