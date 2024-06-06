import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int I  = 0, G  = 0, Y  = 0, GR = 0, VI = 0, VG = 0, EP = 0; 
        String V ;
        
        for (Y=0; Y != 2; )
        {
            I = sc.nextInt();
            G = sc.nextInt();
            if (I>G){VI++;}
            else if (G>I){VG++;}
            else {EP++;}
            GR++;
            System.out.println("Novo grenal (1-sim 2-nao)");
            Y = sc.nextInt();
        }
        System.out.println(GR+" grenais");
        System.out.println("Inter:"+VI);
        System.out.println("Gremio:"+VG);
        System.out.println("Empates:"+EP);
        if(VI> VG){System.out.println("Inter venceu mais");}
        else if (VG>VI){System.out.println("Gremio venceu mais");}
        else {System.out.println("Nao houve vencedor");}
    }
}
