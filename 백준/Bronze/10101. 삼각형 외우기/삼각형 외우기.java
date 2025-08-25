import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int chk = 1;
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        
        //180이 아닐 땐 아래의 연산을 수행하지 않는다.
        if(a + b + c != 180) {
            chk = 0;
        }
        
        if(chk == 1) {
            //3개 같
            if(a == b && b == c ) {
                System.out.println("Equilateral");
            }
            //다 다름
            else if(a != b && b != c && c != a) {
                System.out.println("Scalene");
            }
            //2개 같
            else {
                System.out.println("Isosceles");
            }
        }
        else if(chk == 0) {
            System.out.println("Error");
        }
        
        s.close();
        
    }
}