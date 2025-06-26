import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
        int b = s.nextInt();
        
        int b1 = b%10; //5
        int b2 = (b/100) * 100; //300
        int b3 = b - b1 - b2; //80
        
        int c = a*b1; //3
        int d = a*b3; //4
        int e = a*b2; //5
        
        System.out.println(c);
        System.out.println(d/10);
        System.out.println(e/100);
        
        System.out.println(c+d+e);
        
        s.close();
          
    }
}