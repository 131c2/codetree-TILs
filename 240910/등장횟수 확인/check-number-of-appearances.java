import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, i, cnt;

        cnt = 0;

        for(i = 1 ; i <= 5 ; i++){
            a = sc.nextInt();
            if(a % 2 ==0){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}