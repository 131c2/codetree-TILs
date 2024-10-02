import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, cnt, n;

        n = sc.nextInt();

        cnt = 1;

        for(i = n ; i >= 1 ; i --){
            for(j = n ; j > i ; j --){
                System.out.print("  ");
            }
            for(j = 1 ; j <= i; j ++){
                System.out.print(cnt + " ");
                cnt ++;
                if(cnt == 10){
                    cnt = 1;
                }
            }
            System.out.println();
        }
    }
}