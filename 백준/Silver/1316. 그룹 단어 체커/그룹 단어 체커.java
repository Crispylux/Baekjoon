import java.util.Scanner;

public class Main {
    public static void main(String[] args ){ 
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        int count = 0;
        
        for(int i = 0; i<n; i++) {
            
            int[] apb = new int[26]; //0, 있으면 1
            String str = s.nextLine();
            char[] mychar = str.toCharArray();
            int check = 1;
            
            for(int j = 0; j<mychar.length; j++) {
                int dumy = mychar[j]-'a';
                
                //그룹단어인지 아닌지
                if(apb[dumy] == 0) {
                    apb[dumy] = 1;
                }
                else if(mychar[j] != mychar[j-1]){ //여기 걸리면 그룹단어가 아니다
                    check = 0;
                    break;
                }
            }
            
            if(check == 1) {
                count++;
            }
            
        }
        
        System.out.println(count);
        s.close();
    }
}