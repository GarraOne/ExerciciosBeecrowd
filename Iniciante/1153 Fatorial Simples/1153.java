import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), I=0, S = 1, NN = N;

       while ( I  < N)
        {           
            S = S*NN;
            NN--;
            I++;
        }
        System.out.println(S);
    }
}
