import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, n, max, min, cnt, idxMin, idxMax;
        final int INT_MIN = Integer.MIN_VALUE;
        final int INT_MAX = Integer.MAX_VALUE;

        cnt = 0;
        idxMin = -1;
        idxMax = -1;
        n = sc.nextInt();

        max = INT_MIN;
        min = INT_MAX;
        
        int[] a = new int[n + 1];

        for(i = 0 ; i < n ; i ++){
            a[i] = sc.nextInt();
        }

        //최솟값의 위치 찾기
        for(i = 0 ; i < n ; i ++){
            if(a[i] < min){
                min = a[i];
                idxMin = i;
            }
        }

        //최솟값의 뒤에 위치하면서 최댓값이 되는 항 찾기
        for(i = 0 ; i < n ; i ++){
            if(a[i] > max && i > idxMin){
                max = a[i];
                idxMax = i;
            }
        }
        if((idxMax - idxMin) > 0){
            System.out.print(max - min);
        }
        else{
            System.out.print(0);
        }
        
        


        /* 잘못 이해한 풀이
        for(i = 1 ; i <= n ; i ++){
            cnt ++;
            if(a[i - 1] > a[i]){
                for(j = 1 ; j < cnt ; j ++){
                    if(a[i - 1] - a[i - (1 + j)] > max){
                        max = a[i - 1] - a[i - (1 + j)];
                    }
                }
                cnt = 0;
            }
        }
        if(max > 0){
            System.out.print(max);
        }
        else {
            System.out.print(0);
        }
        */
    }
}