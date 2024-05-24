import java.util .Scanner;

public class Main {
    public static void main (String[]args){
      
      Scanner sc= new Scanner (System.in);
      double X = sc.nextDouble();
      double Y ;
      String YY = "";
if (X < 400  || X == 400 ) { Y = 1.15; YY= "15";}
else if (X < 800 || X  == 800  ) {Y = 1.12;  YY= "12"; }
else if (X < 1200 || X == 1200 ) {Y = 1.10;  YY= "10";  ;}
else if (X < 2000 || X == 2000 ) {Y = 1.07; YY= "7" ;}
else { Y = 1.04;  YY = "4" ;}

double XY = X*Y; 
double XX = XY - X;
System.out.println(String.format("Novo salario: %.2f" , XY));
System.out.println(String.format("Reajuste ganho: %.2f" , XX));
System.out.println("Em percentual: " + YY + " %");
      
    }
}
