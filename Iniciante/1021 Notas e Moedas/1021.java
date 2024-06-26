import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
     
        int X = (int)A,
         A1 = X/100,
         A2 =(X - A1*100)/50,
         A3 =(X -(A1*100+A2*50) )/20,
         A4 =(X -(A1*100+A2*50+A3*20) )/10,
         A5 =(X -(A1*100+A2*50+A3*20+A4*10) )/5,
         A6 =(X -(A1*100+A2*50+A3*20+A4*10+A5*5) )/2,
         A7 =(X -(A1*100+A2*50+A3*20+A4*10+A5*5+A6*2) )/1;
        
        double XXX  = (A - X)*100;
        int XX = (int)XXX,
         AA1 =(XX/100),
         AA2 =(XX -(AA1*100) )/50,
         AA3 =(XX -(AA1*100+AA2*50) )/25,
         AA4 =(XX -(AA1*100+AA2*50+AA3*25) )/10,
         AA5 =(XX -(AA1*100+AA2*50+AA3*25+AA4*10) )/5,
         AA6 =(XX -(AA1*100+AA2*50+AA3*25+AA4*10+AA5*5) )/1;

        System.out.println("NOTAS:" );

        System.out.println(A1+" nota(s) de R$ 100.00" );
        System.out.println(A2+" nota(s) de R$ 50.00" );
        System.out.println(A3+" nota(s) de R$ 20.00" );
        System.out.println(A4+" nota(s) de R$ 10.00" );
        System.out.println(A5+" nota(s) de R$ 5.00" );
        System.out.println(A6+" nota(s) de R$ 2.00" );

        System.out.println("MOEDAS:" );

        System.out.println(A7+" moeda(s) de R$ 1.00" );
        System.out.println(AA2+" moeda(s) de R$ 0.50" );
        System.out.println(AA3+" moeda(s) de R$ 0.25" );
        System.out.println(AA4+" moeda(s) de R$ 0.10" );
        System.out.println(AA5+" moeda(s) de R$ 0.05" );
        System.out.println(AA6+" moeda(s) de R$ 0.01" );
    }
}
