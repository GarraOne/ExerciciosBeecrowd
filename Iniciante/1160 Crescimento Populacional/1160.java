import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), pa, pb, a, aa, bb;
        double g1, g2, porA, porB;
        String s = "";
        while(n > 0){
            a = 0;
            pa = sc.nextInt();
            pb = sc.nextInt();
            g1 = sc.nextDouble();
            g2 = sc.nextDouble();
            while(pa <= pb){
                porA = pa * g1/100;
                porB = pb * g2/100;  
                aa = (int) porA;
                bb = (int) porB;
                pa += aa;
                pb += bb; 
                a++;
                if(a > 100){
                    break;
                }
            }
            n--;
            if(a > 100){
                    s += "Mais de 1 seculo.\n";  
                }else{
                    s += a + " anos.\n";  
                }
        }
        System.out.print(s);
    }
}
