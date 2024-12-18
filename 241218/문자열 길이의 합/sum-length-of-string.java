import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i, cnt1, cnt2;
        cnt1 = 0;
        cnt2 = 0;

        n = sc.nextInt();
        String[] str = new String[n];

        for(i = 0 ; i < n ; i ++){
            str[i] = sc.next();
            cnt1 += str[i].length();
            if(str[i].charAt(0) == 'a'){
                cnt2 ++;
            }
        }
        System.out.print(cnt1 + " " + cnt2);
    }
}