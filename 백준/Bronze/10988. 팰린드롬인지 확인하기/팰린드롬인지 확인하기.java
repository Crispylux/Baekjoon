import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        char[] myary = a.toCharArray();
        int len = myary.length;
        int chk = 1;
        for(int i = 0; i<len/2; i++) {
            if(myary[i] != myary[len-1-i]) {
                chk = 0;
            }
        }
        System.out.println(chk);
        s.close();
    }
}