import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        char[] mychar = a.toCharArray();
        int count = 0;

        for (int i = 0; i < mychar.length; i++) {
            if (i + 2 < mychar.length &&
                mychar[i] == 'd' && mychar[i+1] == 'z' && mychar[i+2] == '=') {
                count++;
                i += 2; // 총 3글자니까 총 3칸 이동됨
            }
            else if (i + 1 < mychar.length &&
                ((mychar[i] == 'c' && (mychar[i+1] == '=' || mychar[i+1] == '-')) ||
                 (mychar[i] == 'd' && mychar[i+1] == '-') ||
                 (mychar[i] == 'l' && mychar[i+1] == 'j') ||
                 (mychar[i] == 'n' && mychar[i+1] == 'j') ||
                 (mychar[i] == 's' && mychar[i+1] == '=') ||
                 (mychar[i] == 'z' && mychar[i+1] == '='))) {
                count++;
                i += 1; // 총 2글자니까 총 2칸 이동됨
            }
            else {
                count++; // 일반 문자
            }
        }

        System.out.println(count);
        s.close();
    }
}
