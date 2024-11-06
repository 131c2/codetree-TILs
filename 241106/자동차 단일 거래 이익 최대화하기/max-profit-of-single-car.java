import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, n, max, cnt;
        final int INT_MIN = Integer.MIN_VALUE;

        cnt = 0;
        n = sc.nextInt();

        max = INT_MIN;

        int[] a = new int[n + 1];

        a[n] = 0;

        for(i = 0 ; i < n ; i ++){
            a[i] = sc.nextInt();
        }
        for(i = 1 ; i <= n ; i ++){
            cnt ++;
            if(a[i - 1] > a[i]){
                for(j = 1 ; j < cnt ; j ++){
                    if(a[i - 1] - a[i - (1 + j)] > max){
                        max = a[i - 1] - a[i - (1 + j)];
                    }
                }
                cnt = 0;
            }
        }
        if(max > 0){
            System.out.print(max);
        }
        else {
            System.out.print(0);
        }
        
    }
}