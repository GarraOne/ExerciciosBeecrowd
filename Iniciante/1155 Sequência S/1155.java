public class Main {
    public static void main(String[] args) {
        double S = 0, I = 1;
        while ( I < 101)
        {          
            S = S + 1/I;
            I++; 
        }
        System.out.println(String.format("%.2f",S));
    }
}
