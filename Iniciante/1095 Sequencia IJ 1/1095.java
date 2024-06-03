import java.util.Scanner;
public class Main {
    public static void main(String[] args)  {
        int J =0;
        int  I = 1;
        for( J = 60; J >= 0 ; J = J-5 , I = I + 3 )
        {
            System.out.println("I=" + I + " J=" + J );
        }
    }
}
