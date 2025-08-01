import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int count = 1; //몇번째 약수인지
        int chk = 0; //0 입력?
        
        
        for(int i = 1; i<=n; i++) {
            
            if(n%i == 0) {
                if(count == k) {
                    System.out.println(i);
                    chk = 1;
                    break;
                }
                count++;
            }
        }
        
        if(chk == 0) {
            System.out.println(0);
        }
        
        s.close();
    }
}