import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, n, m;

        n = sc.nextInt();
        m = sc.nextInt();

        int[][] a = new int[n][m];
        int[][] b = new int[n][m];

        for(i = 0 ; i < n ; i ++){
            for(j = 0 ; j < m ; j ++){
                a[i][j] = sc.nextInt();
            }
        }

        for(i = 0 ; i < n ; i ++){
            for(j = 0 ; j < m ; j ++){
                b[i][j] = sc.nextInt();
            }
        }

        for(i = 0 ; i < n ; i ++){
            for(j = 0 ; j < m ; j ++){
                if(a[i][j] == b[i][j]){
                    System.out.print(0 + " ");
                }
                else{
                    System.out.print(1 + " ");
                }
            }
            System.out.println();
        }
    }
}