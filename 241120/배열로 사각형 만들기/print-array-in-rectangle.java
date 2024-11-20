import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j;

        int[][] a = new int[5][5];

        for(i = 0 ; i < 5 ; i ++){
            a[0][i] = 1;
            a[i][0] = 1;
        }

        for(i = 1 ; i < 5 ; i ++){
            for(j = 1 ; j < 5 ; j ++){
                a[i][j] = a[i][j - 1] + a[i - 1][j];
            }
        }
        
        for(i = 0 ; i < 5 ; i ++){
            for(j = 0 ; j < 5 ; j ++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}