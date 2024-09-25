import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, n;

        n = sc.nextInt();

        if(n % 2 == 0 || n == 1){
            for(i = 1 ; i <= n ; i ++){
                for(j = 1 ; j <= n ; j ++){
                    if(j % 2 == 0 && j >= i){
                        System.out.print("* ");
                    }
                    else if(i == 1){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
        else{
            for(i = 1 ; i <= n ; i ++){
                for(j = 1 ; j <= n ; j ++){
                    if(j % 2 == 0 && j >= i){
                        System.out.print("* ");
                    }
                    else if(i == 1){
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
}