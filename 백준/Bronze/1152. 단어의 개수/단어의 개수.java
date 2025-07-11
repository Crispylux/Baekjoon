import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String mystr = s.nextLine().trim();
        if (mystr.isEmpty()) {
            System.out.println(0);
        } else {
            String[] sliceit = mystr.split(" ");
            System.out.println(sliceit.length);
        }
    }
}