import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        int max = 0;
        int whati = -1;
        int chk = 1;
        
        a = a.toLowerCase(); //다 소문자로 바꿈
        char[] mystr = a.toCharArray(); //문자 배열로 바꿈
        char[] apb = new char[26]; //a~z(초기화0)
        
        for(int i = 0; i<mystr.length; i++) {
            apb[mystr[i]-'a']++; //a=0 ~ z=25
        }
        
        for(int i = 0; i<26; i++) {
            if(apb[i] > max) {
                max = apb[i];
                whati = i;
            }
        }
        
        //가장 많이 사용된 알파벳이 여러개이면 문자가 아니라 ? 출력
        for(int i = 0; i<26; i++) {
            if(max == apb[i] && whati != i) {
                chk = 0;
            }
        }
        
        if(chk == 0) {
            System.out.print("?");
        }
        else if(chk == 1) {
            System.out.print(Character.toUpperCase( (char)(whati + 'a') )); //
        }
        
        s.close();
    }
}