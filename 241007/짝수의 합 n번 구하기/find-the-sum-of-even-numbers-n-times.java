import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, n, i, j, sum;

        n = sc.nextInt();

        for(i = 1 ; i <= n ; i ++){
            a = sc.nextInt();
            b = sc.nextInt();
            sum = 0;

            for(j = a ; j <= b ; j ++){
                if(j % 2 == 0){
                    sum += j;
                }
            }
            System.out.println(sum);
        }
    }
}