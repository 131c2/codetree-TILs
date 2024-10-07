import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i, j, cnt;

        n = sc.nextInt();

        for(i = 1 ; i <= n ; i ++){
            cnt = 0;
            for(j = 2 ; j <= i ; j ++){
                if(i % j == 0){
                    cnt ++;
                }
            }
            if(cnt == 1){
                System.out.print(i + " ");
            }
        }

        /* 해설풀이
        for(int i = 1; i <= n; i++) {
            if(i == 1) continue;
            boolean isprime = true;
            
            for(int j = 2; j < i; j++)
                if(i % j == 0) isprime = false;
            
            if(isprime)
                System.out.print(i + " ");
        }
        */
    }
}