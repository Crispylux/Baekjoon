import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] ary = new int[43]; //0~42 (0번째는 안 쓴다. 42로 나눴을때는 42에 넣기)
        
        for(int i = 1; i<=10; i++) {
            int a = s.nextInt();
            int nam = a%42; //나머지
            
            if(nam == 0) {
                ary[42] = 1;
            }
            else {
                ary[nam] = 1;
            }
        }
        
        int count = 0; //개수
        for(int j = 1; j <= 42; j++) {
            if(ary[j] == 1) {
                count++;
            }
        }
        
        System.out.println(count);
        s.close();
        
    }
}