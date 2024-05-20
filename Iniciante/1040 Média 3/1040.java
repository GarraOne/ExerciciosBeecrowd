import java.util .Scanner;
import java.io.IOException;
import java.text.DecimalFormat;

public class Main {
    
    
    public static void main (String[]args){
        
        DecimalFormat df = new DecimalFormat("0.0");
        
        Scanner sc = new Scanner(System.in);
     
     
     double N1 = 2*sc.nextDouble();
     double N2 = 3*sc.nextDouble();
     double N3 = 4*sc.nextDouble();
     double N4 = 1*sc.nextDouble();
      
     double O = (N1 + N2 + N3 + N4); 
     double M = (O*100)/1000;
      
      System.out.println("Media: " + df.format(M));
      
      if (M > 7  || M == 7 ) {
          
          
          System.out.println("Aluno aprovado.");
      }
      
      else if (M < 5 ) {
          
          System.out.println("Aluno reprovado.");
      
      }
      else{
      System.out.println("Aluno em exame.");
      
      
      double N5 = sc.nextDouble();
      
      System.out.println(String.format("Nota do exame: %.1f" , N5));
      double M2 = (M + N5)/2;
       if (M2 <5){
           
           System.out.println("Aluno reprovado.");
           
       }
       
       else
       
       {
           
           System.out.println("Aluno aprovado.");
           
           
       }
      
      System.out.println(String.format("Media final: %.1f" , M2));
      
      
      }

    }
    
}
