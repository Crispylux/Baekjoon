import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String dal = s.nextLine();
        char[] chardal = dal.toCharArray();
        int hap = 0;
        for(int i = 0; i<chardal.length; i++) {
            if(chardal[i] == 'A' || chardal[i] == 'B' || chardal[i] == 'C') {
                hap += 3;
            }
            else if (chardal[i] == 'D' || chardal[i] == 'E' || chardal[i] == 'F') {
                hap += 4;
            }
            else if (chardal[i] == 'G' || chardal[i] == 'H' || chardal[i] == 'I') {
                hap += 5;
            }
            else if (chardal[i] == 'J' || chardal[i] == 'K' || chardal[i] == 'L') {
                hap += 6;
            }
            else if (chardal[i] == 'M' || chardal[i] == 'N' || chardal[i] == 'O') {
                hap += 7;
            }
            else if (chardal[i] == 'P' || chardal[i] == 'Q' || chardal[i] == 'R' || chardal[i] == 'S') {
                hap += 8;
            }
            else if (chardal[i] == 'T' || chardal[i] == 'U' || chardal[i] == 'V') {
                hap += 9;
            }
            else if (chardal[i] == 'W' || chardal[i] == 'X' || chardal[i] == 'Y' || chardal[i] == 'Z') {
                hap += 10;
            }
        }
        
        System.out.println(hap);
        s.close();
    }
}