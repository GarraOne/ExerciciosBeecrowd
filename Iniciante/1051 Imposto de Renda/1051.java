import java.util.Scanner;
public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        double X = sc.nextDouble();
        double YY = 0;
        if (X < 2000  || X == 2000 ) {  System.out.println("Isento");}
else if (X <3000 || X == 3000 ) {YY =  ((X - 2000)*1.08 + 2000 ); 
    double I = (YY-X) ;
System.out.println(String.format("R$ %.2f" , I));
}
else if (X < 4500|| X == 4500 ) {YY = ((X - 3000)*1.18 + 1000 * 1.08 + 2000 );
    double I = (YY-X) ;
System.out.println(String.format("R$ %.2f" , I));
}
else { YY = (X-4500)*1.28 + 1500*1.18 + 1000 * 1.08 + 2000;
    double I = (YY-X) ;
System.out.println(String.format("R$ %.2f" , I));
}}}
