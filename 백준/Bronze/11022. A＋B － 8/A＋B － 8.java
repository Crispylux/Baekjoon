import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ary = new int[n];
        int[] arya = new int[n];
        int[] aryb = new int[n];
        for(int i = 0; i<n; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            ary[i] = a+b;
            arya[i] = a;
            aryb[i] = b;
        }
        
        for(int i = 0; i<n; i++) {
            System.out.println("Case #"+(i+1)+": "+arya[i]+" + "+aryb[i]+" = "+ary[i]);
        }
        
        s.close();
    }
}