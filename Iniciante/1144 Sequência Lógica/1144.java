import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), I=1;
        for(I = 1; I<= N; I++  )
        {
            System.out.println(I + " " + (I*I) + " " + (I*I*I) );
            System.out.println(I + " " + ((I*I)+ 1)+ " " + ((I*I*I)+ 1));
        }
    }
}
