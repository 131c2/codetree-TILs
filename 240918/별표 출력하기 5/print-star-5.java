import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, k, n;

        n = sc.nextInt();

        for(i = n ; i >= 1 ; i --){
            for(k = 1 ; k <= i ; k ++){
                for(j = 1 ; j <= i ; j ++){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            
            System.out.println();
        }       
    }
}