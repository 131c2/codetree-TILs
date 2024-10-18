import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;

        int[] a = new int[10];

        a[0] = sc.nextInt();
        a[1] = sc.nextInt();

        System.out.printf("%d %d ",a[0] , a[1]);

        for(i = 2 ; i < 10 ; i ++){
            a[i] = a[i - 1] + a[i - 2] * 2;
            System.out.print(a[i] + " ");
        }
    }
}