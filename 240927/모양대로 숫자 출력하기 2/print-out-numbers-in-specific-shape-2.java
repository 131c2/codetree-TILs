import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i, j, n, cnt;

        cnt = 2;

        n = sc.nextInt();

        for(i = 1 ; i <= n ; i ++){
            for(j = 1 ; j <= n ; j ++){
                System.out.print(cnt + " ");
                cnt += 2;
                if(cnt == 10){
                    cnt = 2;
                }
            }
            System.out.println();
        }
    }
}