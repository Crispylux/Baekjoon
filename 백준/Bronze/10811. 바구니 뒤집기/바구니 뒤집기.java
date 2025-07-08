import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[] ary = new int[n+1]; //0번째는 안쓴다
        
        for(int k=1; k<=n; k++) {
            ary[k] = k;
        }
        
        for(int k=1; k<=m; k++) {
            int i = s.nextInt();
            int j = s.nextInt();
            
            //역순
            while(i<j) {
                int dummy = ary[i];
                ary[i] = ary[j];
                ary[j] = dummy;
                i++;
                j--;
            }
        }
        
        for(int k = 1; k<=n; k++) {
            System.out.print(ary[k]+" ");
        }
        
        s.close();
    }
}