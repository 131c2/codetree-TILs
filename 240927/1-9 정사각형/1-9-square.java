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
    }
}