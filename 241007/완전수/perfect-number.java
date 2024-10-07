import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start, end, i, j, cnt, sum;

        start = sc.nextInt();
        end = sc.nextInt();
        
        sum = 0;

        cnt = 0;

        for(i = start ; i <= end ; i ++){
            for(j = 1 ; j <= i; j ++){
                if(i % j == 0 && i != j){
                    sum += j;
                }
            }
            if(sum == i){
                cnt ++;
            }
            sum = 0;
        }
        System.out.println(cnt);
        
    }
}