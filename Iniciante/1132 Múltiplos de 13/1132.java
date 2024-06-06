import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
          int XX = sc.nextInt();
          int YY = sc.nextInt();
          int X, Y, S = 0;
          if (XX > YY){X= YY; Y = XX;}
          else {Y= YY; X = XX;}
          
          for (X = X; X <=Y; X++)
          {
          if (X%13 != 0) S = S +X;
          }
          System.out.println(S);
    }
}

          
