import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int[][] pnt = new int[3][2]; //세 점 좌표 저장
        for(int i = 0; i<3; i++) {
            for(int j = 0; j<2; j++) {
                pnt[i][j] = s.nextInt();
            }
        }
        
        //x,y각각 다른 하나의 숫자를 찾는다
        int diffx;
        int diffy;
        
        if(pnt[0][0] == pnt[1][0]) {
            diffx = pnt[2][0];
        }
        else {
            if(pnt[0][0] == pnt[2][0]) {
                diffx = pnt[1][0];
            }
            else {
                diffx = pnt[0][0];
            }
        }
        
        if(pnt[0][1] == pnt[1][1]) {
            diffy = pnt[2][1];
        }
        else {
            if(pnt[0][1] == pnt[2][1]) {
                diffy = pnt[1][1];
            }
            else {
                diffy = pnt[0][1];
            }
        }
        
        System.out.println(diffx+" "+diffy);
        s.close();
    }
}