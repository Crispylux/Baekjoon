import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ary[][] = new int[100][100]; // 다 0으로 초기화
        int count = 0; //셀 때
        
        for(int i = 0; i<n; i++) {
            int paperx = s.nextInt();
            int papery = s.nextInt();
            
            //10x10의 부분 다 1로 바꾸기
            for(int j = 0; j<10; j++) {
                for(int k = 0; k<10; k++) {
                    ary[paperx+j][papery+k] = 1;
                }
            }   
        }
        
        //1인 부분만 센다
        for(int i = 0; i<100; i++) {
            for(int j = 0; j<100; j++) {
                if(ary[i][j] == 1) {
                    count++;
                }
            }
        }
        
        System.out.println(count);
        s.close();
    }
}