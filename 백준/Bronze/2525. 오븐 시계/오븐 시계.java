import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int m = s.nextInt();
        int cook = s.nextInt();
        
        int res = h*60 + m + cook;
        
        if(res >= 60*24) { //다음 날로 넘어갈 시
            res -= 60*24;
        }
        
        System.out.println(res/60+" "+res%60);
        
        s.close();
    }
}