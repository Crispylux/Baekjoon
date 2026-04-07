import java.util.Scanner;


public class Main {
    
    
    
    //static 함수를 선언할 수도 있음(객체 생성 생략)
    public void asta(int i) {
        for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
    }
    public void spac(int i, int n) {
    	for(int k = 1; k<=2*(n-i); k++) {
                System.out.print(" ");
            }
    }
    
    
    
    public static void main(String[] args) {

        Main m = new Main();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        for(int i = 1; i<=n; i++) {
            m.asta(i);
			m.spac(i,n); 
            m.asta(i);
            
            System.out.println();
        }
        
        
        for(int i=n-1; i>0; i--) {
            m.asta(i);
            m.spac(i,n);
            m.asta(i);
            
            System.out.println();     
        }
        
        s.close();
    }
}