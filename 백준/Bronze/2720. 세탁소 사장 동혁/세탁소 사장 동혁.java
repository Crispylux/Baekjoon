import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        //25, 10, 5, 1
        for(int i = 0; i<t; i++) {
            int n = s.nextInt();
            
            int q = n/25;
            n %= 25;
            
            int d = n/10;
            n %= 10;
            
            int ni = n/5;
            n %= 5;
            
            int p = n;
            
            System.out.println(q+" "+d+" "+ni+" "+p);
        }
        
        s.close();
    }
}