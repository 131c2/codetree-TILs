import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, min, max;
        final int INT_MIN, INT_MAX;

        int[] a = new int[100];

        INT_MIN = Integer.MIN_VALUE;
        INT_MAX = Integer.MAX_VALUE;

        min = INT_MAX;
        max = INT_MIN;

        for(i = 0 ; i < 100 ; i ++){
            a[i] = sc.nextInt();
            if(a[i] == 999 || a[i] == -999){
                break;
            }
            if(a[i] > max){
                max = a[i];
            }
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.print(max + " " + min);
    }
}