import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, x;

        x = 0;

        N = sc.nextInt();

        for(;;){
            N /= 2;
            x ++;
            if(N == 1){
                break;
            }
        }
        System.out.print(x);
    }
}