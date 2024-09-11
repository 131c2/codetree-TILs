import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, i, sumVal, cnt;

        sumVal = 0;
        cnt = 0;

        for(i = 1 ; i <= 10 ; i++) {
            a = sc.nextInt();
            if(a >= 0 && a <= 200){
                sumVal += a;
                cnt ++;
            }
        }
        System.out.printf("%d %.1f",sumVal,(double)sumVal/cnt);
    }
}