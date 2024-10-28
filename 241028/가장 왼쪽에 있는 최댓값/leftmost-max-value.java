import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, i, j, idx, max, range;

        N = sc.nextInt();
        int[] a = new int[N];

        range = N;

        final int INT_MIN = Integer.MIN_VALUE;
        
        for(i = 0 ; i < N ; i ++){
            a[i] = sc.nextInt();
        }

        for(;;){
            max = INT_MIN;
            idx = -1;

            for(j = 0 ; j < range ; j ++){
                if(a[j] > max){
                    max = a[j];
                    idx = j + 1;
                }
            }
            range = idx - 1;
            System.out.print(idx + " ");
            if(idx == 1){
                break;
            }
        }
    }
}