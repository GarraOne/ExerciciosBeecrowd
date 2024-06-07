import java.util.Scanner;
public class Main {
    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);
          int XX = sc.nextInt(), YY = sc.nextInt(), X, Y;
          if (XX > YY){X= YY; Y = XX;}
          else {Y= YY; X = XX;}
          
          for (X =(X + 1); X < Y; X++)
          {
          if (X%5 == 2 ||X%5 == 3 ) System.out.println(X);
          }
    }
}
