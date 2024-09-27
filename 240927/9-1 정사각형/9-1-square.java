import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, n, cnt;

        n = sc.nextInt();

        cnt = 9;

        for(i = 1 ; i <= n ; i ++){
            for(j = 1 ; j <= n ; j ++){
                System.out.print(cnt);
                cnt --;
                if(cnt == 0){
                    cnt = 9;
                }
            }
            System.out.println();
        }
    }
}