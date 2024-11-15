import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, n, m, num;
        
        num = 0;

        n = sc.nextInt();
        m = sc.nextInt();

        int[][] a = new int[n][m];

        for(i = 0 ; i < m ; i ++){
            if(i % 2 == 0){
                for(j = 0 ; j < n ; j ++){
                    a[j][i] = num;
                    num ++;
                }
            }
            else{
                for(j = n - 1 ; j >= 0 ; j --){
                    a[j][i] = num;
                    num ++;
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