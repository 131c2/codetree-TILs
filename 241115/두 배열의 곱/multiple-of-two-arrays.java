import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j;

        int [][] a = new int[3][3];
        int [][] b = new int[3][3];

        for(i = 0 ; i < 3 ; i ++){
            for(j = 0 ; j < 3 ; j ++){
                a[i][j] = sc.nextInt();
            }
        }
        for(i = 0 ; i < 3 ; i ++){
            for(j = 0 ; j < 3 ; j ++){
                b[i][j] = sc.nextInt();
            }
        }

        for(i = 0 ; i < 3 ; i ++){
            for(j = 0 ; j < 3 ; j ++){
                System.out.print(a[i][j] * b[i][j] + " ");
            }
            System.out.println();
        }
    }
}