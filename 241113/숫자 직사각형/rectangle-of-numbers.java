import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, n, m, num;

        n = sc.nextInt();
        m = sc.nextInt();

        int[][] a = new int[n][m];
        num = 1;

        for(i = 0 ; i < n ; i ++){
            for(j = 0 ; j < m ; j ++){
                a[i][j] = num;
                num ++;
            }
        }

        for(i = 0 ; i < n ; i ++){
            for(j = 0 ; j < m ; j ++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}