import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i, j;

        n = sc.nextInt();

        for(i = 1 ; i <= n ; i ++){
            for(j = 1 ; j <= n ; j ++){
                if(i == 1 || j == 1 || j < i || i == n || j == n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }
}