import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int max = 0;
        int maxnum = 0;
        for(int i = 0; i<9; i++) {
            int a = s.nextInt();
            if(a>max) {
                max = a;
                maxnum = i+1;
            }
        }
        
        System.out.println(max+"\n"+maxnum);
        s.close();
    }
}