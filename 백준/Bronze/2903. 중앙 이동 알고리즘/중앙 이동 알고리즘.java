import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        //3*3 5*5 9*9 17*17. . . 
        //n*2-1
        
        int first = 3; //초기상태
        for(int i = 1; i<n; i++) {
            first = first*2 - 1;
        }
        
        System.out.println(first*first);
        s.close();
               
    }
}