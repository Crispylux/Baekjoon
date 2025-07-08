import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        int i = s.nextInt();
        
        char[] aary = a.toCharArray();
        
        System.out.println(aary[i-1]);
        
    }
}