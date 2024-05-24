import java.util .Scanner;

public class Main {
    public static void main (String[]args){
      
      Scanner sc= new Scanner (System.in);
      String X = sc.next();
      String Y = sc.next();
      String Z = sc.next();
      String Z1 = "vertebrado";
      String Z2 = "ave";
      String Z3 = "carnivoro";
      String Z4 = "onivoro";
      String Z5 = "inseto";
      String Z6 = "hematofago";
      String Z7 = "hematofago";
      
      if (X.equalsIgnoreCase(Z1) ) 
      {
          if (Y.equalsIgnoreCase(Z2) )
          {
              if(Z.equalsIgnoreCase(Z3) ) {System.out.println("aguia");}
              
              else {System.out.println("pomba");}
          }
          else 
          {
              if(Z.equalsIgnoreCase(Z4)) {System.out.println("homem");}
              
              else {System.out.println("vaca");}
          }
      }
      
      
      else  

      {
          if (Y.equalsIgnoreCase(Z5))
          {
              if(Z.equalsIgnoreCase(Z6)) {System.out.println("pulga");}
              
              else {System.out.println("lagarta");}
          }
          else 
          {
              if(Z.equalsIgnoreCase(Z7)) {System.out.println("sanguessuga");
                  
              }
              
              else {System.out.println("minhoca");}
          }
      }
    }
}
