import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, k, n, m, num;

        num = 1;

        n = sc.nextInt();
        m = sc.nextInt();

        int[][] a = new int[n][m];

        for(i = 0 ; i < (n + m) ; i ++){
            for(j = 0 ; j < n ; j ++){
                for(k = 0 ; k < m ; k ++){
                    if(j + k == i){
                        a[j][k] = num;
                        num ++;
                    }
                }
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