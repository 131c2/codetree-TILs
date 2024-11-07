import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j;

        double sum, ave;

        
        
        int[][] a = new int[2][4];
        
        for(i = 0 ; i < 2 ; i ++){
            for(j = 0 ; j < 4 ; j ++){
                a[i][j] = sc.nextInt();
            }
        }
        for(i = 0 ; i < 2 ; i ++){
            sum = 0;
            ave = 0;
            for(j = 0 ; j < 4 ; j ++){
                sum += a[i][j];
            }
            ave = sum / 4;
            System.out.printf("%.1f ",ave);
        }
        System.out.println();

        for(i = 0 ; i < 4 ; i ++){
            sum = 0;
            ave = 0;
            for(j = 0 ; j < 2 ; j ++){
                sum += a[j][i];
            }
            ave = sum / 2;
            System.out.printf("%.1f ",ave);
        }
        System.out.println();
        sum = 0;
        ave = 0;
        for(i = 0 ; i < 2 ; i ++){
            for(j = 0 ; j < 4 ; j ++){
                sum += a[i][j];
            }
        }
        ave = sum / 8;
        System.out.printf("%.1f ",ave);
    }
}