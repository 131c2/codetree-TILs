import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i, cnt;

        n = sc.nextInt();

        cnt = 0;
        
        for(i = 1 ; i <= 5001 ; i ++){
            n /= i;
            cnt ++;

            if(n <= 1){
                break;
            }
        }
        System.out.print(cnt);
    }
}