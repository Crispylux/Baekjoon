import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Double rst = 0.0; //점수 저장
        Double num = 0.0;
        
        for(int i = 0; i<20; i++) {
            Double dummy = 0.0;
            int nxt = 0;
            String a = s.next(); //과목명
            Double b = s.nextDouble(); //몇학점짜리
            String c = s.next(); //점수
            s.nextLine();
            
            if(c.equals("A+")) {dummy = 4.5;}
            else if(c.equals("A0")) {dummy = 4.0;}
            else if(c.equals("B+")) {dummy = 3.5;}
            else if(c.equals("B0")) {dummy = 3.0;}
            else if(c.equals("C+")) {dummy = 2.5;}
            else if(c.equals("C0")) {dummy = 2.0;}
            else if(c.equals("D+")) {dummy = 1.5;}
            else if(c.equals("D0")) {dummy = 1.0;}
            else if(c.equals("F")) {dummy = 0.0;}
            else if(c.equals("P")) {continue;} //계산에서 제외
            
            if(nxt == 0) {
                rst += dummy*b;
                num += b;
            }
        }
        
        System.out.printf("%.6f\n", rst / num);
        
    }
}