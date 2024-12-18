import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, cnt;
        cnt = 0;

        String[] str = new String[10];

        for(i = 0 ; i < 10 ; i ++){
            str[i] = sc.next();
            cnt += str[i].length();
        }
        System.out.print(cnt);
    }
}