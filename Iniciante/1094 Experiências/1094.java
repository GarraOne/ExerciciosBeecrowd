import java.util.Scanner;
public class Main {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  
        int Y = 0;
        int C = 0;
        int R = 0;
        int S = 0;
        for( Y = 1; Y <= N   ; Y++ )
        
        {
            int Q = sc.nextInt();  
            String CC = sc.next();  
            String CE = "C";
            String RE = "R";
    
    if (CC.equalsIgnoreCase(CE))
    {
    C = C + Q;
        
    }
    else if (CC.equalsIgnoreCase(RE))
    {
        R = R + Q;
    }
    else
    {
        S = S + Q;
        
    }
}
int TT = C + R + S;
double T = TT;
double PC = (100 * C)/T ;
double PR = (100 * R)/T ;
double PS = (100 * S)/T ;
    System.out.println("Total: " + TT + " cobaias");
    System.out.println("Total de coelhos: " + C );
    System.out.println("Total de ratos: " + R );
    System.out.println("Total de sapos: " + S );
    System.out.println(String.format("Percentual de coelhos: %.2f" , PC  )+" %" );
    System.out.println(String.format("Percentual de ratos: %.2f", PR  )+" %" );
    System.out.println(String.format("Percentual de sapos: %.2f", PS )+" %" );

}

}
