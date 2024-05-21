import java.util.Scanner;

public class Main {

    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double AB = (A + B + Math.abs(A - B))/2 ;
        double MAI = (AB + C + Math.abs(AB - C))/2 ;
        double MENAB = (A+B)-AB;
        double MEMA = (MENAB + C + Math.abs(MENAB - C))/2 ;
        double MEN = (MENAB + C)- MEMA;
        double AC = (A + B + Math.abs(A - B))/2 ;
        double MED = (A + B + C ) - MAI - MEN ;
        System.out.println(String.format("%.0f" , MEN));
        System.out.println(String.format("%.0f" , MED));
        System.out.println(String.format("%.0f" , MAI));
        System.out.println("");
        System.out.println(String.format("%.0f" , A));
        System.out.println(String.format("%.0f" , B));
        System.out.println(String.format("%.0f" , C));
        
    }

}
