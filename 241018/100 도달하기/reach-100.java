import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i;

        int[] a = new int[100];

        n = sc.nextInt();

        a[0] = 1;
        a[1] = n;

        System.out.printf("%d %d ",a[0] ,a[1]);

        for(i = 2 ; i < 100 ; i ++){
            a[i] = a[i - 1] + a[i - 2];
            System.out.print(a[i] + " ");

            if(a[i] >= 100){
                break;
            }
        }
    }
}