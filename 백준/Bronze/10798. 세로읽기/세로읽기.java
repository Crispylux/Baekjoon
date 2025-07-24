import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[][] ary = new char[5][15];
        for(int i = 0; i<5; i++) {
            String a = s.nextLine();
            for(int j = 0; j<a.length(); j++) {
                ary[i][j] = a.charAt(j);
            }
        }
        
        
        for(int i = 0; i<15; i++) {
            for(int j = 0; j<5; j++) {
                if(ary[j][i] == '\0') { //NULL일 때
                    continue;
                }
                System.out.print(ary[j][i]);
            }    
        }
    }
}