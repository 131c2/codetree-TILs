import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, n;

        n = sc.nextInt();

        for(i = n ; i >= 1 ; i --){
            for(j = 1 ; j <= i ; j ++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(i = 1 ; i < n ; i ++){
            for(j = 0 ; j <= i ; j ++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}