import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] ary = new int[9][9];
        int max = -1;
        int numi = 0;
        int numj = 0;
        
        for(int i = 0; i<9; i++) {
            for(int j = 0; j<9; j++) {
                ary[i][j] = s.nextInt();
                if(ary[i][j] > max) {
                    max = ary[i][j];
                    numi = i;
                    numj = j;
                }
            }
        }
        
        System.out.println(max+"\n"+(numi+1)+" "+(numj+1));
        s.close();
    }
}