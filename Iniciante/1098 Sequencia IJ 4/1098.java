import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    double J =1, I = 0;
    
    for( int T = 0; T <= 10 ; T = T + 1 , I = I + 0.2 , J = J + 0.2 )
    {
        double J1 = J+1, J2 = J+2;
        if (I==0)
        {
            System.out.println("I=" + 0 + " J=" + 1 );
            System.out.println("I=" + 0 + " J=" + 2 );
            System.out.println("I=" + 0 + " J=" + 3 );
        }
        else if(T==10)
        {
            System.out.println("I=" + 2 + " J=" + 3);
            System.out.println("I=" + 2 + " J=" + 4);
            System.out.println("I=" + 2 + " J=" + 5);
        }
        else if(I==1)
        {
            System.out.println("I=" + 1 + " J=" + 2);
            System.out.println("I=" + 1 + " J=" + 3);
            System.out.println("I=" + 1 + " J=" + 4);
        }
        else
        {
            System.out.println(String.format("I=%.1f " ,  I ) + String.format("J=%.1f" ,  J));
            System.out.println(String.format("I=%.1f " ,  I ) + String.format("J=%.1f" ,  J1));
            System.out.println(String.format("I=%.1f " ,  I ) + String.format("J=%.1f" ,  J2));
        }
      }
   }
}
