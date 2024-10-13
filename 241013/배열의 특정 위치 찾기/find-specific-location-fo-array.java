import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, sum1, sum2;

        sum1 = 0;
        sum2 = 0;

        int [] a = new int[10];

        for(i = 0 ; i < 10 ; i ++){
            a[i] = sc.nextInt();
            if(i % 2 != 0){
                sum1 += a[i];
            }
            if((i + 1) % 3 == 0){
                sum2 += a[i];
            }
        }
        System.out.printf("%d %.1f",sum1,(double) sum2 / ((i + 1) / 3));
    }
}