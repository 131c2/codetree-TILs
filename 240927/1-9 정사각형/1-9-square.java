import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i, j, n, cnt;

        cnt = 1;

        n = sc.nextInt();

        for(i = 1 ; i <= n ; i ++){
            for(j = 1 ; j <= n ; j ++){
                if(cnt % 10 >= 1){
                    System.out.print(cnt % 10);
                    cnt ++;
                }
                else{
                    cnt ++;
                    System.out.print(cnt % 10);
                    cnt ++;
                }
                
            }
            System.out.println();
        }
        /* 해설풀이 : cnt 값이 10일 때 1로 초기화 시켜주면 그만..
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(cnt);
                cnt++;
                if(cnt == 10)
                    cnt = 1;
            }
            System.out.println();
        }
*/
    }
}