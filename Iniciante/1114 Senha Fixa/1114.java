import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int X ;
        Scanner sc = new Scanner(System.in);
        while((X = sc.nextInt()) != (2002) )
        {
            System.out.println("Senha Invalida");
        }
        System.out.println("Acesso Permitido");
    }
}
