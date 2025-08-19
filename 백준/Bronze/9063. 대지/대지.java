import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); //점의 갯수
        int maxx = -10001;
        int maxy = -10001;
        int minx = 10001;
        int miny = 10001;
        
        //가장 큰 x,y / 가장 작은 x,y값을 찾아야함
        for(int i = 0; i<n; i++) {
            int x = s.nextInt();
            int y = s.nextInt();
            
            if(x < minx) {
                minx = x;
            }
            if(x > maxx) {
                maxx = x;
            }
            if(y < miny) {
                miny = y;
            }
            if(y > maxy) {
                maxy = y;
            }
        }
        
        int res = (maxx - minx) * (maxy - miny);
        
        System.out.println(res);
        s.close();
        
    }
}