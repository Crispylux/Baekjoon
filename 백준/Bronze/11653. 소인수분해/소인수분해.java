import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        while(true) {
            //나눠지는 수로 나누기
            int num = n;
            for(int i = 2; i<=num; i++) {
                if(n%i == 0) {
                    n /= i;
                    System.out.println(i);
                    break;
                }
            }
            
            if(n == 1) {
                break;
            }
        }
        s.close();
            
    }
}