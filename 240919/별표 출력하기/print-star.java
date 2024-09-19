import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i, j, k, l;

        n = sc.nextInt();

        for(i = 1 ; i <= n ; i ++){
            for(j = 1 ; j <= i ; j ++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        for(k = n ; k > 1 ; k --){
            for(l = 1 ; l < k ; l ++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}