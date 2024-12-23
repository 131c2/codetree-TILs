import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, n, a, cnt;

        n = sc.nextInt();
        cnt = 0;

        String str;
        str = "";

        for(i = 0 ; i < n ; i ++){
            a = sc.nextInt();
            str += Integer.toString(a);
        }

        for(i = 0 ; i < str.length() ; i ++){
            cnt ++;
            System.out.print(str.charAt(i));
            if(cnt == 5){
                cnt = 0;
                System.out.println();
            }            
        }
    }
}