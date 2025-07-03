import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ary = new int[n];
        
        for(int i = 0; i<n; i++) {
            ary[i] = s.nextInt();
        }
        
        int chk = s.nextInt();
        int count = 0;
        for(int i = 0; i<n; i++) {
            if(ary[i] == chk) {
                count++;
            }
        }
        
        System.out.println(count);
        s.close();
    }
}