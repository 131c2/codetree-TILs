import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, cnt;

        cnt = 0;

        int[] a = new int[100];

        a[0] = sc.nextInt();

        for(i = 1 ; i < 100 ; i ++){
            a[i] = a[i - 1] + a[0];
        }

        for(i = 0 ; i < 100 ; i ++){
            if(cnt == 2){
                break;
            }
            else if(a[i] % 5 == 0){
                cnt ++;
            }

            System.out.print(a[i] + " ");

        }
    }
}