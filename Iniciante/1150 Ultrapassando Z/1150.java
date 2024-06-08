import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt(), I=1, S = 0, Z = 0;
        while (Z <= X) 
        {
        Z = sc.nextInt();
        }
       while ( S < Z)
        {
            I++;
            S = S + X + I ;
        }
        System.out.println(I);
    }
}
