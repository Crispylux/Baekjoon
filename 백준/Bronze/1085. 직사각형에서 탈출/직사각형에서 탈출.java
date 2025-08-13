import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt(); //지금x
        int y = s.nextInt(); //지금y
        
        int w = s.nextInt(); //직사각형w 
        int h = s.nextInt(); //직사각형h
        
        int min = 10000;
        if(x<min) {
            min = x;
        }
        if(y<min) {
            min = y;
        }
        if(h-y < min) {
            min = h-y;
        }
        if(w-x < min) {
            min = w-x;
        }
        
        System.out.println(min);
        s.close();
        
    }
}