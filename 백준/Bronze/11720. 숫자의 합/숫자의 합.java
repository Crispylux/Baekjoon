import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        String word = s.nextLine(); //한 줄 입력받기
        
        int hap = 0;
        for(int i = 0; i<n; i++) {
            hap += word.charAt(i) - '0';
        }
        
        System.out.println(hap);
        s.close();
    }
}