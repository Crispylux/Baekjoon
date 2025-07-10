import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();
        int[] myary = new int[26];
        
        //배열 모두 -1로 초기화
        for(int i = 0; i<26; i++) {
            myary[i] = -1;
        }
        
        for(int i = 0; i<word.length(); i++) {
            int count = word.charAt(i) - 'a'; //몇번째 숫자인지 a=0 ~ z=25
            if(myary[count] == -1) { //방문한 적 없을때만
                myary[count] = i;
            }
        }
        
        for(int i = 0; i<26; i++) {
            System.out.print(myary[i]+" ");
        }
        
        s.close();
    }
}