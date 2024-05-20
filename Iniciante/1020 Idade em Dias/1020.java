import java.io.IOException;
import java.util.Scanner;

public class Main {

 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        
        int A = X/365; 
        int B = (X-(A*365))/30;
        int C = X-(A*365+ B*30);

         System.out.println( A+ " ano(s)");
         System.out.println( B+ " mes(es)");
         System.out.println( C+ " dia(s)");

        
        
    }
}
