import java.util.Scanner;
public class Main {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int Y = 0;
        int I = 0;
        int P = 0;
        for( Y = 1; Y <= 100   ; Y++ )
        {
            
    int N = sc.nextInt();      
    if (  N > I )  
   { 
       I = N; P = Y;
      
   }
}
    System.out.println(I);
    System.out.println(P);
        
    }

}
