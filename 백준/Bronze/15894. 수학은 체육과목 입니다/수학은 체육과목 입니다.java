import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //4
        //8
        //12
        //16
        long i = s.nextLong();
        
        System.out.println(i*4);
        s.close();
    }
}