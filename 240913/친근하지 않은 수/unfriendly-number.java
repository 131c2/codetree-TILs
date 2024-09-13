import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i, cnt;
        
        n = sc.nextInt();
        cnt = 0;

        for(i = 1 ; i <= n ; i ++){
            if(i % 2 == 0 || i % 3 == 0 || i % 5 == 0){
                continue;
            }
            cnt++;
        }
        System.out.print(cnt);
    }
}