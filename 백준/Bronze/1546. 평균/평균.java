import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ary = new int[n];
        int max = 0;
        double res = 0;
        
        for(int i = 0; i<n; i++) {
            ary[i] = s.nextInt();
            if (ary[i] > max) {
                max = ary[i];
            }
        }
        
        for(int i = 0; i<n; i++) {
            res += (double)ary[i]/max*100;
        }
        System.out.println(res/n);
        s.close();
    }
}