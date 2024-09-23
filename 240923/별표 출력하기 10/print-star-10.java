import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i, j, k;

        n = sc.nextInt();

        for(i = 1 ; i <= n ; i ++){
            if(i % 2 == 0){
                for(j = 1 ; j <= n - (i / 2 - 1); j ++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                for(k = 1 ; k <= (i + 1) / 2 ; k ++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        for(i = n ; i >= 1 ; i --){
            if(i % 2 == 0){
                for(j = 1 ; j <= n - (i / 2 - 1); j ++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                for(k = 1 ; k <= (i + 1) / 2 ; k ++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}