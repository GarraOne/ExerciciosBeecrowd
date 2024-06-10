public class Main {
    public static void main(String[] args) {
        double S = 0, I = 1, II = 1;
       while ( I < 13)
        {          
            S = S + II/(II*2);
            II=II+2;
            I++;
        }
        System.out.println(String.format("%.2f",S));
    }
}
