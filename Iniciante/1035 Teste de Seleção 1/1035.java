import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt(), D = sc.nextInt(),
         CD = C+D, 
         AB= A+B, 
         AA = A %2;
     
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
