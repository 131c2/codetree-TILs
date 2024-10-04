import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, n, x;

        n = sc.nextInt();

        x = 'A';

        for(i = 1 ; i <= n ; i ++){
            for(j = 1 ; j <= n ; j ++){
                System.out.print((char) x);
                x += 1;
            }
            System.out.println();
        }
    }
}