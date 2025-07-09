//char를 정수형으로 변환하면 자동으로 아스키코드로 변환됨
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char a = s.next().charAt(0);
        System.out.println((int)a);
        
        s.close();
    }
}
