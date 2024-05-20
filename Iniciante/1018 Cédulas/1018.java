import java.io.IOException;
import java.util.Scanner;

public class Main {

 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        
        int A1 = X/100;
        int A2 =(X - A1*100)/50;
        int A3 =(X -(A1*100+A2*50) )/20;
        int A4 =(X -(A1*100+A2*50+A3*20) )/10;
        int A5 =(X -(A1*100+A2*50+A3*20+A4*10) )/5;
        int A6 =(X -(A1*100+A2*50+A3*20+A4*10+A5*5) )/2;
        int A7 =(X -(A1*100+A2*50+A3*20+A4*10+A5*5+A6*2) )/1;

        System.out.println(X);
        System.out.println(A1+" nota(s) de R$ 100,00" );
        System.out.println(A2+" nota(s) de R$ 50,00" );
        System.out.println(A3+" nota(s) de R$ 20,00" );
        System.out.println(A4+" nota(s) de R$ 10,00" );
        System.out.println(A5+" nota(s) de R$ 5,00" );
        System.out.println(A6+" nota(s) de R$ 2,00" );
        System.out.println(A7+" nota(s) de R$ 1,00" );

        
        
    }
}
