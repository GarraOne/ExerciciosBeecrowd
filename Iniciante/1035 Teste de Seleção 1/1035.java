import java.util.Scanner;
import java.io.IOException;

public class Main {

 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int CD = C+D;
        int AB= A+B;
         int AA = A %2;
      
        if (B>C && D>A &&  CD>AB && C>0 && AA==0 && D>0)
        {
            
            System.out.println("Valores aceitos");
        }
        
        else 
    {
        System.out.println("Valores nao aceitos");
    
    }
      
    } 
    
}
