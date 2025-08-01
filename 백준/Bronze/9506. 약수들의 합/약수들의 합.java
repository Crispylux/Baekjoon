import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        while(true) {
            int n = s.nextInt();
            int[] ary = new int[n+1]; //모두 0
            int hap = 0;
            
            if(n == -1) {
                break;
            }
            
            for(int i = 1; i<n; i++) {
                if(n%i == 0) {
                    ary[i] = i;
                    hap+= i;
                }
            }
            
            if(hap != n) {
                System.out.print(n+" is NOT perfect.");
            }
            else{
                System.out.print(n+" = ");
                System.out.print(ary[1]);
                for(int i = 2; i<n; i++) {
                    if(ary[i] == 0) {
                        continue;
                    }
                    System.out.print(" + "+ary[i]);
                }
            }
            
            System.out.print("\n");
            
        }
        
        s.close();
    }
}