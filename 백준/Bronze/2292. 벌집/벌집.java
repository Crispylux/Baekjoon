import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        //1 / 2~7 / 8~19 / 20~37 / ... 
        //1 / 6 / 12 / 18
        
        int i = 6;
        int count = 1;
        
        while(n>1) {
            n = n-i;
            count++; //1추가
            i += 6; //6추가
        }
        
        System.out.println(count);
        s.close();
    }
}