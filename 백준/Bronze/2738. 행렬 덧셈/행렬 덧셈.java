import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); //행
        int m = s.nextInt(); //렬
        int[][] ary = new int[n][m];
        
        s.nextLine();
        
        //받기
        for(int k = 0; k<2; k++) { //2번반복
            
            for(int i = 0; i<n; i++) {
                for(int j = 0; j<m; j++) {
                    ary[i][j] += s.nextInt();        
                }
            }
        
        }
        
        
        //출력
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                System.out.print(ary[i][j]+" ");
            }
            System.out.println("");
        }
        
        s.close();
    }
}