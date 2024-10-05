import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, i, j, n, x;

        n = sc.nextInt();

        for(i = 1 ; i <= n ; i ++){
            a = sc.nextInt();
            b = sc.nextInt();

            x = 1;

            for(j = a ; j <= b ; j ++){
                x *= j;
            }
            System.out.println(x);
        }
    }
}