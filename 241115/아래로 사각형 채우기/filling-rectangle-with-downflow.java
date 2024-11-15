import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, n, num;

        num = 1;
        n = sc.nextInt();

        int[][] a = new int[n][n];

        for(i = 0 ; i < n ; i ++){
            for(j = 0 ; j < n ; j ++){
                a[j][i] = num;
                num ++;
            }
        }

        for(i = 0 ; i < n ; i ++){
            for(j = 0 ; j < n ; j ++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}