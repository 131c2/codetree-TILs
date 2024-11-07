import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, sum;        

        int[][] a = new int[4][4];

        for(i = 0 ; i < 4 ; i ++){
            sum = 0;
            for(j = 0 ; j < 4 ; j ++){
                a[i][j] = sc.nextInt();
                sum += a[i][j];
            }
            System.out.println(sum);
        }       
    }
}