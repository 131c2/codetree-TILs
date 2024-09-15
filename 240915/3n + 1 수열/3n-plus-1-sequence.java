import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, cnt;

        cnt = 0;

        N = sc.nextInt();

        for(;;){
            if(N == 1){
                break;
            }
            else{
                if(N % 2 == 0){
                N /= 2;
                cnt++;
                }
                else{
                    N *= 3;
                    N += 1;
                    cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}