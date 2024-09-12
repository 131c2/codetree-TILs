import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, a, i, sumVal, cnt;

        sumVal = 0;
        cnt = 0;
        
        n = sc.nextInt();

        for(i = 1; i <= n ; i ++){
            a = sc.nextInt();
            sumVal += a;
            cnt++;
        }
        System.out.printf("%d %.1f",sumVal,(double)sumVal/cnt);
    }
}