import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //분자: 1 12 321 1234 54321 ... : 짝수번째 증가
        //분모: 1 21 123 4321 12345 ... : 홀수번째 증가
        int n = s.nextInt();
        int cnt = 0;
        
        for(int i = 1; i<9999; i++) {
            cnt = i;
            if(n - i > 0) {
                n -= i;   
            }
            else {
                break;
            }
        }
        
        
        if(cnt % 2 == 0) { //i가 짝수일 때
            System.out.println(n+"/"+(cnt-n+1));
        }
        else if (cnt % 2 != 0) {
            System.out.println((cnt-n+1)+"/"+n);
        }
        
        s.close();
        
    }
}