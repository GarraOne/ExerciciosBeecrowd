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
   int X = sc.nextInt();
    if (X ==0 ) {System.out.println("NULL");}
    else {
   if ( X % 2 ==	0   )I = "EVEN ";
   else I = "ODD ";
    if ( 0 < X  )II = "POSITIVE";
   else II = "NEGATIVE";
    System.out.println(I + II);
    }
  }
}
}
