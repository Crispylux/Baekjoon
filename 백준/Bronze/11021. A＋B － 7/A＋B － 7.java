import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ary = new int[n];
        for(int i = 0; i<n; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            ary[i] = a+b;
        }
        
        for(int i = 0; i<n; i++) {
            System.out.println("Case #"+(i+1)+": "+ary[i]);
        }
        
        s.close();
    }
}