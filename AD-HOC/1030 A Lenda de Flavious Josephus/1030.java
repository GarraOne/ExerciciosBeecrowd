import java.util.Scanner;

public class Main {

    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);
        
        int N, P, S, VP, D, PO; 
        PO = 0;
        int NN = sc.nextInt();
         
        while(NN > 0){
            
         N = sc.nextInt();
         P = sc.nextInt();
         if (N == 1 || P == 1){S = 1;}
         else{
         S = P - 1;
         VP = P ;
         D = 0;
         
         int M[] = new int [N];
         
         if (P > N){S = P - N - 1;
             
             if (S > N){
                 
                 while (S > N){
                     
                     S = S - N;
   
                 }
             }
         }
        while (N != D){
            if (VP == P){ M[S] = -2; D++; VP = 0;}
            S = S + 1;
            if(S > (N - 1)){S = 0;}
            if (M[S] != -2){VP++;}
 
        }
         }
         
         if(P == 1){S = N;} 
         
        PO++;
        System.out.println("Case "+ PO +": " + S);
        
        
        NN--;
        }
    }
}
