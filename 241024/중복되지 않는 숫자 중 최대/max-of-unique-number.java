import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, i, j, max, cnt;
        final int INT_MIN = Integer.MIN_VALUE;

        N = sc.nextInt();
        max = INT_MIN;

        int[] a = new int[N];
        int[] b = new int[N];

        //b배열 초기화
        for(i = 0 ; i < N ; i ++){
            b[i] = 0;
        }

        //a배열 입력
        for(i = 0 ; i < N ; i ++){
            a[i] = sc.nextInt();
        }

        //중복 숫자가 나왔을 경우 b배열에 1표시
        for(i = 0 ; i < N ; i ++){
            for(j = 0 ; j < N ; j ++){
                if(a[i] == a[j] && i != j){
                    b[i] = 1;
                    b[j] = 1;
                }
            }
        }

        //표시된 b배열과 같은 항에 있는 a배열 0으로 만들기
        for(i = 0 ; i < N ; i ++){
            if(b[i] == 1){
                a[i] = 0;
            }
        }
        
        //a배열에서 중복되지 않은 수 중 최댓값 찾기
        for(i = 0 ; i < N ; i ++){
            if(a[i] > max){
                max = a[i];
            }
        }

        //a배열의 모든 항이 0이라면 전부 중복수이기 때문에 -1출력
        if(max == 0){
            System.out.print(-1);
        }
        //아닐경우 최댓값 max출력
        else{
            System.out.print(max);
        }
        
    }
}