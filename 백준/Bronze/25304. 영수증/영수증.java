import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total = s.nextInt();
        int num = s.nextInt();
        int hap = 0;
        for (int i = 0; i<num; i++) {
            int price = s.nextInt();
            int how = s.nextInt();
            hap += price*how;
        }
        
        if(hap == total) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
        s.close();
    }
}