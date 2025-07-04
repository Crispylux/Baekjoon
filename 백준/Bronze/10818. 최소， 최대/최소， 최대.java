import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        
        int max = -1000001;
        int min = 1000001;
        for(int i = 0; i<num; i++) {
            int a = s.nextInt();
            if(a<min) {
                min = a;
            }
            
            if(a>max) {
                max = a;
            }
        }
        
        System.out.println(min+" "+max);
        s.close();
    }
}