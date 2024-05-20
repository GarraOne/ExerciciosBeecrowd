import java.io.IOException;
import java.util.Scanner;

public class Main {

 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        
        int A = X/3600 ;
        int B = (X - (A*3600))/60 ;
        int C = (X -( A*3600 + B*60));

        System.out.println(A +":"+ B +":"+ C);

        
        
    }
}
