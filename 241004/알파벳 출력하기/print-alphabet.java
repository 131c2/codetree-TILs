import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, n, x;

        n = sc.nextInt();

        x = 'A';

        for(i = 1 ; i <= n ; i ++){
            for(j = 1 ; j <= i ; j ++){
                System.out.print((char)x);
                x += 1;
                if(x == 91){
                    x = 65;
                }
            }
            System.out.println();
        }
    }
}