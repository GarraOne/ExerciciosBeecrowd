import java.util.Scanner;

public class Main {

 
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
int X = sc.nextInt();      

int Y =2;

for( Y = X; Y <= (X +11)  ; Y++ )

{ 
   if (Y % 2 !=	0 )System.out.println(Y);
    
    }
  }   
}
