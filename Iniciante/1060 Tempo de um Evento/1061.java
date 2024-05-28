// Código ainda não finalizado

import java.util.Scanner;
public class Main {
 
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
      
        String F = sc.next();  int DI = sc.nextInt(); 
        int HI = sc.nextInt(); F = sc.next();
        int MI = sc.nextInt(); F = sc.next();
        int SI = sc.nextInt(); F = sc.next();
        int DF = sc.nextInt();
        int HF = sc.nextInt(); F = sc.next();
        int MF = sc.nextInt(); F = sc.next();
        int SF = sc.nextInt();
        
        int TTI = 0 ,TTF = 0, TD = 0, TS = 0 , TM = 0, TH = 0;
        
        TTI = HI * 3600 + MI *60 + SI;
        TTF = HF * 3600 + MF *60 + SF;
        
        if ( TTF < TTI)
        { TD = DF - DI - 1; }
        else
        { TD = DF - DI; }
        
        if (HF < HI )
        { TH = HI - HF; }
        else
        { TH = HF - HI; }
        
        if(MF < MI)
        { TM = MI - MF; }
        else
        { TM = MF - MI; }
         
        if(SF < SI)
        { TS = SI - SF; }
        else
        {TS = SF - SI;  }
         
         
         System.out.println(TD + " dia(s)");
         System.out.println(TH + " hora(s)");
         System.out.println(TM + " minuto(s)");
         System.out.println(TS + " segundo(s)");


    }
}
