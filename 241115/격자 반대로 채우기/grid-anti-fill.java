import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, n, num;

        num = 1;
        n = sc.nextInt();
        int[][] a = new int[n][n];

        if(n % 2 == 0){
            for(i = n - 1 ; i >= 0 ; i --){
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
        }
        else{
            for(i = n - 1 ; i >= 0 ; i --){
            if(i % 2 != 0){
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
        }
        

        for(i = 0 ; i < n ; i ++){
            for(j = 0 ; j < n ; j ++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}