import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i;

        n = sc.nextInt();

        int[] a = new int[n];
        int[] cntA = new int[10];

        for(i = 0 ; i < 10 ; i ++){
            cntA[i] = 0;
        }
        for(i = 0 ; i < n ; i ++){
            a[i] = sc.nextInt();
        }
        for(i = 0 ; i < n ; i ++){
            cntA[a[i]] ++;
        }
        for(i = 1 ; i < 10 ; i ++){
            System.out.println(cntA[i]);
        }

    }
}