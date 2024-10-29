import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, max, min;
        final int INT_MIN = Integer.MIN_VALUE;
        final int INT_MAX = Integer.MAX_VALUE;

        max = INT_MIN;
        min = INT_MAX;

        int[] a = new int[10];

        for(i = 0 ; i < 10 ; i ++){
            a[i] = sc.nextInt();
            if(a[i] > max && a[i] < 500){
                max = a[i];
            }
            if(a[i] < min && a[i] > 500){
                min = a[i];
            }
        }
        System.out.print(max + " " + min);
    }
}