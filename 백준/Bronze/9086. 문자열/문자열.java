import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); //\n빼고읽음
        s.nextLine(); //한줄띄어주기
        
        for(int i = 0; i<n; i++) {
            String mystr = s.nextLine();
            char[] res = mystr.toCharArray();
            System.out.print(res[0]+""+res[res.length - 1]+"\n");
        }
        
        s.close();
    }
}