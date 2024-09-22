import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i, j;

        n = sc.nextInt();

        for(i = 1 ; i <= n ; i ++){
            if(i % 2 == 0){
                for(j = 1 ; j <= i ; j ++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                System.out.println("*");
            }
        }
    }
}