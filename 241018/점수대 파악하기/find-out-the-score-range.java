import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;

        int[] a = new int[101];
        int[] cntA = new int[11];

        //cntA 초기화
        for(i = 0 ; i < 11 ; i ++){
            cntA[i] = 0;
        }

        //입력 리스트, 0점을 받은 경우 탈출
        for(i = 0 ; i < 101 ; i ++){
            a[i] = sc.nextInt();
            if(a[i] == 0){
                break;
            }
        }

        //10점 단위 배열 카운팅
        for(i = 0 ; i < 101 ; i ++){
            cntA[a[i] / 10] ++;
        }

        //10~100점대 출력, 100 점부터 출력
        for(i = 10 ; i > 0 ; i --){
            System.out.println(i * 10 + " - " + cntA[i]);
        }
    }
}