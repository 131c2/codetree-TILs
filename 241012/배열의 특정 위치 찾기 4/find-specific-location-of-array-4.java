import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, cnt, sum;

        int[] a = new int[10];

        cnt = 0;
        sum = 0;

        for(i = 0 ; i < 10 ; i ++){
            a[i] = sc.nextInt();
            if(a[i] != 0){
                if(a[i] % 2 == 0){
                    sum += a[i];
                    cnt ++;
                }
            }
            else{
                break;
            }
        }
        System.out.printf("%d %d",cnt,sum);
    }
}