import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, n;

        n = sc.nextInt();

        for(i = 0 ; i < n ; i ++){
            for(j = 1 ; j <= n ; j ++){
                if(j % 2 == 0){
                    System.out.print(n - i);
                }
                else{
                    System.out.print(i + 1);
                }
            }
            System.out.println();
        }
    }
}