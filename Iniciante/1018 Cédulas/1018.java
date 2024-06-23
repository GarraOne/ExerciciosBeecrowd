import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        
        int A1 = X/100,
        A2 =(X - A1*100)/50,
        A3 =(X -(A1*100+A2*50) )/20,
        A4 =(X -(A1*100+A2*50+A3*20) )/10,
        A5 =(X -(A1*100+A2*50+A3*20+A4*10) )/5,
        A6 =(X -(A1*100+A2*50+A3*20+A4*10+A5*5) )/2,
        A7 =(X -(A1*100+A2*50+A3*20+A4*10+A5*5+A6*2) )/1;

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
