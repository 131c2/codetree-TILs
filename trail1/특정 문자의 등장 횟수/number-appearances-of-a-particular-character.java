import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int cntee = 0;
        int cnteb = 0;

        for(int i = 0 ; i <= str.length() - 2 ; i ++){
            if(str.substring(i, i+2).equals("ee")){
                cntee ++;
            }
            
            if(str.substring(i, i+2).equals("eb")){
                cnteb ++;
            }
        }

        System.out.printf("%d %d",cntee, cnteb);
        
        // Please write your code here.
    }
}