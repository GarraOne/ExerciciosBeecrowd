import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double X ;
        double O = -1;
        double P = -1;
        int I=0;
        for (I=0; I != 1; )
        {
            X = sc.nextDouble();
            if(X >= 0 && X<= 10) 
            {
                if ( P== -1 ){P = X;}
                else {O = X;}
            }
            if ( O>= 0 && O<= 10 &&  P>= 0 &&  P<= 10)
            {System.out.println(String.format("media = %.2f",((O + P)/2)));
                I++; }
            else if (X < 0 || X > 10) {System.out.println("nota invalida");}
        } 
    }
}
