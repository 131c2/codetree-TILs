import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m, i, j;

        n = sc.nextInt();
        m = sc.nextInt();

        for(i = 1 ; i <= n ; i ++){
            for(j = 1; j <= m ; j ++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}