import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, sum;

        sum = 0;

        int[][] a = new int[4][4];

        for(i = 0 ; i < 4 ; i ++){
            for(j = 0 ; j < 4 ; j ++){
                a[i][j] = sc.nextInt();
                if(i >= j){
                    sum += a[i][j];
                }
            }
        }
        System.out.print(sum);
    }
}