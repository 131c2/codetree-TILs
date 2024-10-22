import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, min, n, cnt;

        n = sc.nextInt();
        int[] a = new int[n];
        cnt = 0;

        int INT_MAX = Integer.MAX_VALUE;
        min = INT_MAX;

        for(i = 0 ; i < n ; i ++){
            a[i] = sc.nextInt();
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.print(min + " ");

        for(i = 0 ; i < n ; i ++){
            if(a[i] == min){
                cnt ++;
            }
        }
        System.out.print(cnt);
    }
}