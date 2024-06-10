import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = -1, N = -1, S= 0, SS = 0, XX = -1;
       while (SS>=0)
        {          
          if (N == -1)  {X = sc.nextInt();N=4;XX = X;}
          if (X == 0) {SS=-1;}
          if (XX%2 == 0) {S = S + XX ; N-- ;}
          XX++;
          if (N == -1){System.out.println(S); S = 0;}
        }
    }
}
