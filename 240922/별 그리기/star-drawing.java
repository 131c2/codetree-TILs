import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i, j;

        n = sc.nextInt();

        for(i = 1 ; i <= n; i ++){
            for(j = i ; j < n ; j ++){
                System.out.print(" ");
            }
            for(j = 1 ; j <= i * 2 - 1 ; j ++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i = n ; i > 1; i --){
            for(j = n ; j >= i ; j --){
                System.out.print(" ");
            }
            for(j = 1 ; j <= i * 2 - 3 ; j ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}