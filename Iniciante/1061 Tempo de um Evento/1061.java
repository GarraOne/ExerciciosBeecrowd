import java.util.Scanner;
public class Main {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        sc.next(); 
        int DI = sc.nextInt();
        int HI = sc.nextInt(); sc.next(); 
        int MI = sc.nextInt(); sc.next();
        int SI = sc.nextInt(); sc.next();
        int DF = sc.nextInt();
        int HF = sc.nextInt(); sc.next(); 
        int MF = sc.nextInt(); sc.next();
        int SF = sc.nextInt(); 
        
        int totalInicial = DI * 86400 + HI * 3600 + MI * 60 + SI;
        int totalFinal = DF * 86400 + HF * 3600 + MF * 60 + SF;
        
        int diferenca = totalFinal - totalInicial;
        
        int dias = diferenca / 86400;
        diferenca %= 86400;
        int horas = diferenca / 3600;
        diferenca %= 3600;
        int minutos = diferenca / 60;
        int segundos = diferenca % 60;
        
        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");
    }
}
