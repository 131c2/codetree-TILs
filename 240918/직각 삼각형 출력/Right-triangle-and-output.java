import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, k, n;

        n = sc.nextInt();

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
    }
}