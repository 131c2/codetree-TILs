import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i, j, min, val;
        final int INT_MAX = Integer.MAX_VALUE;
        
        min = INT_MAX;
        val = 0;
        n = sc.nextInt();

        int[] a = new int[n];

        for(i = 0 ; i < n ; i ++){
            a[i] = sc.nextInt();
        }

        for(i = 0 ; i < n ; i ++){
            for(j = i + 1 ; j < n ; j ++){
                val = a[j] - a[i];
                if(val < min){
                    min = val;
                }
            }
        }
        System.out.print(min);

    }
}