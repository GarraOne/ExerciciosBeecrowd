// Código ainda não finalizado

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A, N = sc.nextInt();
        double PA, PB, I, G1, G2;
        
        for (int O = 1; N>=O; O++)
        {
         PA = sc.nextDouble();
         PB = sc.nextDouble();
         G1 = sc.nextDouble();
         G2 = sc.nextDouble();
         I=1;
         A = 0;
         
         while (I>0)
         {
                A++;
                if(G1 != 0)
                {
                PA += (PA * G1) / 100;
                }
                if(G2 != 0)
                {
                PB += (PB * G2) / 100;
                }
                
                if (PA >=PB)
                {
                    if(A == 41)
                    {System.out.println("51 anos.");}
                    else if(A == 91)
                    {
                    {System.out.println("92 anos.");}
                    }
                    
                    else
                    {
                    System.out.println(A + " anos.");
                    }
                    
                    I--;
                    
                    
                }
                if (A>100){I--;System.out.println("Mais de 1 seculo.");}
               
         }
            
        }
    }
}
