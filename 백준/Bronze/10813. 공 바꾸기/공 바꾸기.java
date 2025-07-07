import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); //바구니 
        int m = s.nextInt(); //바꾸는 횟수
        int[] ary = new int[n+1];
        
        //공 넣기(초기상태 설정)
        for(int i = 1; i<=n; i++) {
            ary[i] = i;
        }
        
        //바꾸기 실행
        for(int i = 1; i<=m; i++) {
            int dummy = 0;
            int a = s.nextInt();
            int b = s.nextInt();
            dummy = ary[a];
            ary[a] = ary[b];
            ary[b] = dummy;
        }
        
        for(int i = 1; i<=n; i++) {
            System.out.print(ary[i]+" ");
        }
        
        s.close();
    }
}