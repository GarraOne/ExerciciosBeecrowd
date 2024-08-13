import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int I , E, N = 0, X[ ] = new int[10];
for(I = 0; I < 10; I++, N++) {
E = sc.nextInt();
if (E <1)  E = 1;
X[I]= E ;
System.out.println("X["+N+"] = "+X[I]);
}}}
