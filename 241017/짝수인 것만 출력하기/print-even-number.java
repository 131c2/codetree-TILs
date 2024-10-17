import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, n;

        n = sc.nextInt();

        int[] a = new int[n];

        for(i = 0 ; i < n ; i ++){
            a[i] = sc.nextInt();
            if(a[i] % 2 == 0){
                System.out.print(a[i] + " ");
            }
        }
    }
}