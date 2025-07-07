import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] ary = new int[31]; //처음엔 모두가 0
        
        for(int i = 1; i<=28; i++) {
            int a = s.nextInt();
            ary[a] = 1; //출석한 사람 1로 바꾸기
        }
        
        for(int i = 1; i<=30; i++) {
            if(ary[i] == 0) {
                System.out.println(i);
            }
        }
        
        s.close();
    }
}