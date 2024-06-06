import java.util.Scanner;
public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        double X , Y;
        int N = sc.nextInt();
        for (int I = 0; I < N; I++)
        {
            X = sc.nextInt();
            Y = sc.nextInt();
            if (Y == 0) {System.out.println("divisao impossivel");}
            else  {System.out.println(String.format("%.1f",X/Y));}
        }
    }
}
