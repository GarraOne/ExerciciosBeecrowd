import java.util.Scanner;
public class Main {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();      
        double Y = 0;
        
        for( Y = 1; Y <= N   ; Y++ )
        {
    double Z1 = sc.nextDouble();      
    double Z2 = sc.nextDouble();      
    double Z3 = sc.nextDouble();      

    double X = ((Z1*2)+(Z2*3)+(Z3*5))/10  ;
System.out.println(String.format("%.1f" , X));
            
        }
    }
}
