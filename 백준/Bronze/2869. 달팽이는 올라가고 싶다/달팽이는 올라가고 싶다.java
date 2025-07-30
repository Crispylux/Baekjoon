import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(); //달팽이 스펙
        int b = s.nextInt(); //미끄러짐
        int v = s.nextInt(); //나무막대 길이
        
        int day = (v-b-1)/(a-b) + 1;
        
        System.out.println(day);
        s.close();
        
    }
}