import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt(), I=1, F = 0, F1 = 1, F2 = 0;

       while ( I  <= X)
        {           
            System.out.print(F);
            if (I != X) System.out.print(" ");
            F = F1 + F2;
            F1 = F2 ;
            F2 = F;
            I++;
        }
            System.out.println("");
    }
}
