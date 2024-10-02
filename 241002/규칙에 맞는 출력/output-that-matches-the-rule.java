import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, N;

        N = sc.nextInt();

        for(i = 0 ; i < N ; i ++){
            for(j = i ; j >= 0 ; j --){
                System.out.print(N - j + " ");
            }
            System.out.println();
        }
    }
}