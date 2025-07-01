import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();

        for(int i = 1; i<n; i+=4) {
            System.out.print("long ");
        }
        
        System.out.println("int");
        
        s.close();
    }
}