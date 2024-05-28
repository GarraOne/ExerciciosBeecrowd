import java.util.Scanner;
public class Main {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();      
        int Y = 0;
for( Y = 1; Y <= 10   ; Y++ )
{
    int X = N * Y ;
    System.out.println( Y + " x " + N + " = " + X);
        }
        
    }
    
}
