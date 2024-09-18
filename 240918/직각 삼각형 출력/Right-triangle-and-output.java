import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, k, n;

        n = sc.nextInt();

        //내 풀이 : 별이 하나씩 증가하는 직각삼각형에 두 번째 줄부터 시작하는 직각삼각형을 하나더 올리는 느낌으로 함

        for(i = 1 ; i <= n ; i ++){
            for(j = 1 ; j <= i ; j ++){
                System.out.print("*");
                }
                if(i >= 2){
                    for(k = 2; k <= i ; k ++){
                        System.out.print("*");
                    }
                }
            System.out.println();
        }

        /* 해설 풀이 : i 값을 0에에서 시작하여 j 값에 2를 곱한뒤 1을 더해 반복수를 맞춤.

        for(i = 0 ; i < n ; i ++){
            for(j = 0 ; j < 2 * i + 1 ; j ++){
                System.out.print("*");
            }
            System.out.println();
        }
        */
    }
}