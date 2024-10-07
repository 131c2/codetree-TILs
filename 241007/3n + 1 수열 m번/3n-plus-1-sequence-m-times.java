import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, n, m, cnt;

        cnt = 0;

        m = sc.nextInt();
        
        for(i = 1 ; i <= m ; i ++){
            n = sc.nextInt();
            for(;;){
                if(n != 1){
                    if(n % 2 == 0){
                        n /= 2;
                        cnt ++;
                    }
                    else{
                    n *= 3;
                    n ++;
                    cnt++;
                    }
                }
                else{
                    break;
                }
            }
            System.out.println(cnt);
            cnt = 0;
        }
    }
}