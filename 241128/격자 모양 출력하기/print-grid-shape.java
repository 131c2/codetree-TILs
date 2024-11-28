import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, n, m, r, c;

        n = sc.nextInt();
        m = sc.nextInt();

        int [][] a = new int[n + 1][n + 1];

        for(i = 0 ; i < m ; i ++){
            r = sc.nextInt();
            c = sc.nextInt();
            a[r][c] = r * c;
        }
        for(i = 1 ; i < n + 1 ; i ++){
            for(j = 1 ; j < n + 1 ; j ++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}