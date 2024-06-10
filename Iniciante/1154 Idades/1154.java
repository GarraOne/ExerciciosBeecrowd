import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double S = 0, N = 0, I = 0;
       while ( N >=0 )
        {          
            S = S + N;
            I++; 
            N = sc.nextDouble();
        }
        I--;
        System.out.println(String.format("%.2f",S/I));
    }
}
