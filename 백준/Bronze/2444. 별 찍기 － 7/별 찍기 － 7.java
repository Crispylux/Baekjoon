import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int cnt = n-1;
        int cnt2 = 1;
        //증가
        for(int i = 1; i<n; i++) {
            for(int j = 0; j<cnt; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j<cnt2; j++) {
                System.out.print("*");
            }
            cnt--;
            cnt2+=2;
            System.out.println("");
        }
        
        //가운데
        for(int i = 0; i<(2*n-1); i++) {
            System.out.print("*");
        }
        
        System.out.println("");
        
        //cnt = 1
        //cnt2 = 7
        //감소
        cnt++;
        cnt2-=2;
        for(int i = 1; i<n; i++) {
            for(int j = 0; j<cnt; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j<cnt2; j++) {
                System.out.print("*");
            }
            cnt++;
            cnt2-=2;
            System.out.println("");
        }
        
        
        
    }
}