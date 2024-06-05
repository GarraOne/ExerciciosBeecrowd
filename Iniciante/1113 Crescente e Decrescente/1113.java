import java.util.Scanner;
public class Main {
    public static void main(String[] args)  {
        int X, Y ;
        Scanner sc = new Scanner(System.in);
        
        while((X = sc.nextInt()) != (Y = sc.nextInt()) )
         if (X < Y )
         {
             System.out.println("Crescente");
         }
         else
         {
             System.out.println("Decrescente");
         }
    }
}
