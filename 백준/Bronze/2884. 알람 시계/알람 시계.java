import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int h = s.nextInt();
        int m = s.nextInt();
        
        int chgm = h*60 + m; //분으로 다 바꿈
        chgm -= 45; //45분을 뺀다
        
        if(chgm < 0 ){
            chgm += 60*24;
        }
        
        System.out.println(chgm/60+" "+chgm%60);
        
        s.close();
    }
}