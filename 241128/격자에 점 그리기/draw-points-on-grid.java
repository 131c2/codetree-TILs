import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, m, n, r, c, cnt;

        cnt = 1;

        n = sc.nextInt();
        m = sc.nextInt();

        int[][] a = new int[n][n];

        for(i = 0 ; i < m ; i ++){
            r = sc.nextInt();
            c = sc.nextInt();
            a[r - 1][c - 1] = cnt;
            cnt ++;
        }

        for(i = 0 ; i < n ; i ++){
            for(j = 0 ; j < n ; j ++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}