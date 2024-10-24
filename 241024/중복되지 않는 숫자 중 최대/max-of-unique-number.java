import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, i, j, max, cnt;
        final int INT_MIN = Integer.MIN_VALUE;

        N = sc.nextInt();
        max = INT_MIN;

        int[] a = new int[N];

        for(i = 0 ; i < N ; i ++){
            a[i] = sc.nextInt();
        }
        for(i = 0 ; i < N ; i ++){
            for(j = 0 ; j < N ; j ++){
                if(a[i] == a[j] && i != j){
                    a[i] = 0;
                    a[j] = 0;
                }
            }
        }
        for(i = 0 ; i < N ; i ++){
            if(a[i] > max){
                max = a[i];
            }
        }
        if(max == 0){
            System.out.print(-1);
        }
        else{
            System.out.print(max);
        }
        
    }
}