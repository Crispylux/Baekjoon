import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int b = s.nextInt();
        StringBuilder stb = new StringBuilder();
        
        while(n>0) {
            if(n%b >= 10) {
                stb.append((char)((n%b) + 55));
            }
            else {
                stb.append(n%b);
            }
            
            n /= b;
        }
        
        System.out.println(stb.reverse());
        s.close();
    }
}