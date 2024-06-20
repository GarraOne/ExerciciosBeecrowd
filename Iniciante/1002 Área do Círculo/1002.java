import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double R = sc.nextDouble(), A = 3.14159 * (R * R);
		System.out.println(String.format("A=%.4f", A)); 
	}
}
