import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        String s, e;
        
        while(true)
        {
            i = 1;
            n = sc.nextInt();
            if(n == 0){break;}
            s = "";
            
            while(i <= n)
            {
                if(i == n) {e ="\n";}
                else {e = " ";}
                s = s + "" + i + e;
                i++;
            }
            System.out.print(s);
        }
    }
}
