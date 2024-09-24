import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, n;

        n = sc.nextInt();

        for(i = 1 ; i <= n * 2 + 1 ; i ++){
            if(i % 2 == 0){
                for(j = 1 ; j <= n + 1 ; j ++){
                    System.out.print("*   ");
                }
                System.out.println();
            }
            else{
                for(j = 1 ; j <= n * 2 + 1 ; j ++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}