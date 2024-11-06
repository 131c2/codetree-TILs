import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, n, max, min, cnt, idxMin, idxMax, ans;
        final int INT_MIN = Integer.MIN_VALUE;
        final int INT_MAX = Integer.MAX_VALUE;

        cnt = 0;
        idxMin = 0;
        idxMax = -1;
        ans = INT_MIN;
        n = sc.nextInt();

        max = INT_MIN;
        min = INT_MAX;
        
        int[] a = new int[n];

        for(i = 0 ; i < n ; i ++){
            a[i] = sc.nextInt();
        }

        for(i = 0 ; i < n ; i ++){
            max = -1; //여기에 INT_MIN을 넣으면 왜 출력이 이상하게 나올까...
            min = INT_MAX;
            for(j = 0 ; j < n ; j ++){
                if(a[j] > max && j > idxMax){
                    max = a[j];
                }
            }
            for(j = 0 ; j < n ; j ++){
                if(a[j] == max){
                    idxMax = j;
                }
            }
            for(j = idxMin ; j <= idxMax ; j ++){
                if(a[j] < min){
                    min = a[j];
                }
            }
            idxMin = idxMax;
            if((max - min) > ans){
                ans = max - min;
            }
        }
        if(ans > 0){
            System.out.print(ans);
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