import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, n;

        n = sc.nextInt();

        for(i = 1 ; i <= n ; i ++){
            for(j = 1 ; j <= n ; j ++){
                System.out.printf("(%d, %d) ",i , j);
                if((i + j) % 4 == 0){
                    System.out.println();
                }
            }
        }
    }
}