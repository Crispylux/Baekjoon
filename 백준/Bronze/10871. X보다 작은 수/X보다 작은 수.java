import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = s.nextInt();
        int count = 0;
        int[] ary = new int[n]; //모든 값은 자동으로 0이 된다
        for(int i = 0; i<n; i++) {
            int a = s.nextInt();
            if (a<x) {
                ary[i] = a;
            }
        }
        
        for(int i = 0; i<n; i++) {
            if(ary[i] != 0) {
                System.out.print(ary[i]+" ");
            }
        }
        
        s.close();
    }
}