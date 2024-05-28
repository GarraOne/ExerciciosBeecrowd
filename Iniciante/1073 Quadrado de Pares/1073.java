import java.util.Scanner;
public class Main {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();      
        int Y = 0;
        String I = "";
        String II = "";
for( Y = 1; Y <= N  ; Y++ )
{
    if ( Y % 2 == 0 )    
    {
        int Z = Y*Y;
    System.out.println(Y + "^2 = " + Z );
      }
    }
  }
}
