import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); //바구니의 수
        int m = s.nextInt(); //받는 줄의 수
        int[] nary = new int[n+1];
        
        for(int i = 1; i<=m; i++) {
            int a = s.nextInt(); //a부터
            int b = s.nextInt(); //b까지
            int ballnum = s.nextInt(); //공번호
            
            //공을 넣기
            for(int j=a; j<=b; j++) {
                nary[j] = ballnum;
            }
        }
        
        for(int k = 1; k<=n; k++) {
            System.out.print(nary[k]+" ");
        }
        
        s.close();
    }
}