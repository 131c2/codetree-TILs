import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, n, cnt;

        n = sc.nextInt();

        cnt = 0;

        for(i = 1 ; i <= n ; i ++){
            if(i % 2 == 0){
                for(j = 1 ; j <= n ; j ++){
                    cnt += 2;
                    System.out.print(cnt + " ");
                }
            }
            else{
                for(j = 1 ; j <= n ; j ++){
                    cnt ++ ;
                    System.out.print(cnt + " ");
                }
                
            }
            System.out.println();
        }
    }
}