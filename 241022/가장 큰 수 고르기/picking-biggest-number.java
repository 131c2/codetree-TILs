import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, max;

        final int INT_MIN = Integer.MIN_VALUE;

        max = INT_MIN;

        int[] a = new int[10];

        for(i = 0 ; i < 10 ; i ++){
            a[i] = sc.nextInt();
            if(a[i] > max){
                max = a[i];
            }
            
        }

        System.out.print(max);
    }
}