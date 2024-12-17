import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1, str2;

        int i, a, cnt;

        str1 = sc.nextLine();
        str2 = sc.next();

        a = str1.length();
        cnt = 0;

        for(i = 0 ; i < a ; i ++){
            if(str1.charAt(i) == str2.charAt(0)){
                cnt ++;
            }
        }
        System.out.print(cnt);
    }
}