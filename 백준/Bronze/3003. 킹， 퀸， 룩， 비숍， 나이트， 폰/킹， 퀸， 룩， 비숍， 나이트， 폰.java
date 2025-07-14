import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int[] ary = new int[6];
        for(int i = 0; i<6; i++) {
            ary[i] = s.nextInt();            
        }
        
        //1 1 2 2 2 8
        System.out.println((1-ary[0])+" "+
                         (1-ary[1])+" "+
                         (2-ary[2])+" "+
                         (2-ary[3])+" "+
                         (2-ary[4])+" "+
                         (8-ary[5]));
        
        s.close();
        
    }
}