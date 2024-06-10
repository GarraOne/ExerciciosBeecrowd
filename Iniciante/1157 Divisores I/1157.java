import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = N, I = 1;
       while ( N>0 )
        {          
          if (M%I == 0) System.out.println(I);
           N--; I++;
        }
    }
}
