import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();      
        int Y = 0;
        int I = 0;
        int II = 0;
for( Y = 1; Y <= N  ; Y++ )

{ 
   int X = sc.nextInt();
    
   if ( 10<=X   &&   X <=20   )I++;
   else II++;
    
}
    System.out.println(I + " in");
    System.out.println(II + " out" );
    }
}
