import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, n, m, cnt;
        
        cnt = 0;
        n = sc.nextInt();

        int[] a = new int[n];

        m = sc.nextInt();

        for(i = 0 ; i < n ; i ++){
            a[i] = sc.nextInt();
            if(a[i] == m){
                cnt ++;
            }
        }
        System.out.print(cnt);
    }
}