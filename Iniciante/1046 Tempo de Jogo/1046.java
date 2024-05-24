import java.util.Scanner;

public class Main {

 
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        
        if (A > B)
        {int H = (24 - A) + B; System.out.println("O JOGO DUROU " + H + " HORA(S)"); }
        else if (A < B)
        { int H = B - A ;System.out.println("O JOGO DUROU " + H + " HORA(S)");}
        else 
        { int H = 24; System.out.println("O JOGO DUROU " + H + " HORA(S)"); }
    }
}       
