import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int m = s.nextInt();
        int n = s.nextInt();
        int hap = 0;
        int min = 10001;
        
        for(int i = m; i<=n; i++) {
            int chk = 1;
            
            if(i == 1) {
                continue;
            }
            
            //i가 소수인지 아닌지 찾기!
            for(int j = 2; j<i; j++) {
                if(i%j == 0) { //소수가 x
                    chk = 0;
                    break;
                }
            }
            
            //소수일 때
            if(chk == 1) {
                hap += i;
                if(i < min) { //최솟값 판정
                    min = i;
                }
            }
        }
        
        if(hap == 0) {
            System.out.println(-1);
        }
        else {
            System.out.println(hap+"\n"+min);
        }
        s.close();

    }
}