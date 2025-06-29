import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int res = 0;
        
        if(a == b && b == c) { //3개가 같음
            res = 10000 + a*1000;
        }
        else { 
            if(a==b) {
                res = 1000 + a*100;
            }
            else if(b==c) {
                res = 1000 + b*100;
            }
            else if(c==a) {
                res = 1000 + c*100;
            }
            else { //모두 다름
                //최대 수를 찾아야됨
                int max = (a>b) ? ((a>c)?a:c) : ((b>c)?b:c);
                res = max*100;
            }
        }
        
        System.out.println(res);
        s.close();
    }
}