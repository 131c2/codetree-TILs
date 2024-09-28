import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, n;

        n = sc.nextInt();

        for(i = 1 ; i <= n ; i ++){
            if(i % 2 == 0){
                for(j = n ; j >= 1 ; j --){
                    System.out.print(j);
                }
                System.out.println();
            }
            else{
                for(j = 1 ; j <= n ; j ++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}