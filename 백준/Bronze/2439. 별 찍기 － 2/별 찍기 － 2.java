import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        for(int i = n; i>=1; i--) {
            for(int j = 1; j<=n; j++) {
                if(j>=i) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
        s.close();
    }
}