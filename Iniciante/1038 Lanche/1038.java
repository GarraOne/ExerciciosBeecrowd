import java.util.Scanner;
import java.io.IOException;


public class Main {

 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();
        double Q = sc.nextDouble();
        
        switch (C){
            
            
            case 1 :
                
               System.out.println(String.format("Total: R$ %.2f" ,Q*4 )); 
                
                break;
                
                 case 2 :
                    
                    System.out.println(String.format("Total: R$ %.2f" ,Q*4.50 )); 
                    
                    break;
                    
                    
                    case 3 :
                        
                        System.out.println(String.format("Total: R$ %.2f" ,Q*5 ));
                        
                        
                        break;
                        
                        case 4 :
                            
                            System.out.println(String.format("Total: R$ %.2f" ,Q*2 )); 
                            
                            break;
                            
                            case 5 :
                                
                                
                                System.out.println(String.format("Total: R$ %.2f" , Q*1.50 ));
                                
                                
                                break;
         
        }
        
    }
}
