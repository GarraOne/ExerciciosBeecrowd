import java.util.Scanner;
public class Main {
    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);
          int X = 0, A = 0, G = 0, D = 0;
         
          while (X != 4) {          
               X = sc.nextInt();
              switch(X)
              {
                  case 1:
                       A++;
                      break;
                  case 2:
                       G++;
                      break;
                  case 3:
                       D++;
                      break;
              }
          }
           System.out.println("MUITO OBRIGADO");
           System.out.println("Alcool: "+A);
           System.out.println("Gasolina: "+G);
           System.out.println("Diesel: "+D);
    }
}
