import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true) {
            int a = s.nextInt();
            int b = s.nextInt();
            int chk = 0;
            if(a==0 && b==0) {
                break;
            }
            
            //factor
            for(int i = 1; i <= b/a; i++) {
                if(a*i==b) {
                    System.out.println("factor");
                    chk = 1;
                    break;
                }
            }
            
            //multiple
            for(int i = 1; i<=10000; i++) {
                if(b*i == a) {
                    System.out.println("multiple");
                    chk = 1;
                    break;
                }
            }
            
            //neither
            if(chk == 0) {
                System.out.println("neither");
            }
            
        }
        
        s.close();
    }
}