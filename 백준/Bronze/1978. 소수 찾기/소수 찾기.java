import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int[] ary = new int[n];
        int count = n; //소수의 개수
        
        for(int i = 0; i<n; i++) {
            int a = s.nextInt();
            ary[i] = a;
            
            
            
            //소수 판별
            if (a <= 1) {
                count--;
                continue;
            }
            for(int j = 2; j<a; j++) {
                if( a%j == 0 ) {
                    count --; //소수가 아니다.
                    break;
                }
            }
        }
        
        System.out.println(count);
        s.close();
        
    }
}