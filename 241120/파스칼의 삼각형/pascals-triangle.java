import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, n;

        n = sc.nextInt();

        int[][] a = new int[n][n];

        for(i = 0 ; i < n ; i ++){
            a[i][0] = 1;
        }
        
        for(i = 1 ; i < n ; i ++){
            for(j = 1 ; j < n ; j ++){
                a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
            }
        }

        for(i = 0 ; i < n ; i ++){
            for(j = 0 ; j < n ; j ++){
                if(i >= j){
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}