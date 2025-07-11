import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String b = s.next();
        s.nextLine();
        
        char[] aary = a.toCharArray();
        char[] bary = b.toCharArray();
        
        char dummy = aary[0];
        aary[0] = aary[2];
        aary[2] = dummy;
        
        dummy = bary[0];
        bary[0] = bary[2];
        bary[2] = dummy;
        
        int numa = Integer.parseInt(new String(aary));
        int numb = Integer.parseInt(new String(bary));
        int res = (numa > numb) ? numa : numb;
        System.out.println(res);
        s.close();
        
    }
}