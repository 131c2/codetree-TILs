import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i, j, cnt;

        n = sc.nextInt();

        cnt = 1;

        for(i = 1 ; i <= n ; i ++){
            for(j = 1 ; j <= n ; j ++){
                System.out.print(cnt + " ");
                cnt ++;
            }
            System.out.println();
        }
    }
}