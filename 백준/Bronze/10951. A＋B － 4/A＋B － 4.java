import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        while(s.hasNextInt()) { //EOF (파일의 끝까지 계속 받는다.) 종료하면 끝난다.
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println(a+b);
        }
        
        s.close();
        
    }
}