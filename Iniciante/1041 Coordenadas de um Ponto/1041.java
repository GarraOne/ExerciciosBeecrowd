import java.util.Scanner;
import java.io.IOException;


public class Main {

 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double X = sc.nextDouble();
        double Y = sc.nextDouble();

if(  X > 0  &&  Y > 0) // Q1

System.out.println("Q1");


 else if (X < 0  &&  Y > 0 ) { //Q2
    
System.out.println("Q2");
}

  else if (X < 0  &&  Y < 0) { //Q3
    
System.out.println("Q3");

}


 else if ( X > 0  &&  Y < 0) { //Q4
    
System.out.println("Q4");

}

 else if ( X == 0 &&  Y != 0 ) { //EX
    
System.out.println("Eixo Y");

}

 else if (  Y == 0 && X != 0 ) { //EY
    
System.out.println("Eixo X");

}

else // 00
{
System.out.println("Origem");


}
}
}
