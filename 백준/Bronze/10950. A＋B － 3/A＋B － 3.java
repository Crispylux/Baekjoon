import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[] ary = new int[num];
        
        for(int i = 0; i<num; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            ary[i] = a+b;
        }
        
        for(int i = 0; i<num; i++) {
            System.out.println(ary[i]);
        }
        
        s.close();
    }
}