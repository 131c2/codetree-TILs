import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //선언
        int n1, n2, i, j, cnt;

        //n1, n2 입력
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        //배열 선언
        int[] a = new int[n1];
        int[] b = new int[n2];

        //배열 입력
        for(i = 0 ; i < n1 ; i ++){
            a[i] = sc.nextInt();
        }
        for(i = 0 ; i < n2 ; i ++){
            b[i] = sc.nextInt();
        }

        //배열 비교.
        for(i = 0 ; i < n1 ; i ++){
            //cnt 초기화
            cnt = 0;
            if(a[i] == b[0]){
                for(j = 0 ; j < n2 ; j ++){
                    if(a[i + j] == b[j]){
                        cnt ++;
                    }
                }

                //cnt 값이 n2 값과 일치하면 Yes 출력 및 탈출
                if(cnt == n2){
                    System.out.print("Yes");
                    break;
                }
            }
        }

        //for문이 끝나고 cnt 값이 0인경우 배열이 일치한 것이 없었기 때문에 No 출력
        if(cnt == 0){
            System.out.print("No");
        }

    }
}