import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start, end, i, j, cnt1, cnt2;

        start = sc.nextInt();
        end = sc.nextInt();

        cnt1 = 0;
        cnt2 = 0;

        for(i = start ; i <= end ; i ++){
            for(j = 1 ; j <= i ; j ++){
                if(i % j == 0){
                    cnt1 ++;
                }
            }
            if(cnt1 == 3){
                cnt2 ++;
            }
            cnt1 = 0;
        }
        System.out.println(cnt2);
    }
}