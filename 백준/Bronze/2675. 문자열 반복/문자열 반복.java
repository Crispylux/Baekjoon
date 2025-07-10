import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 0; i<n; i++) {
            int routine = s.nextInt();
            String word = s.next();

            //출력
            for(int j = 0; j<word.length(); j++) {
                for(int k = 0; k<routine; k++) {
                    System.out.print(word.charAt(j));    
                }
            }
            System.out.println("");
        }
        
        s.close();
    }
}