import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, n;

        n = sc.nextInt();

        for(i = 1 ; i <= n ; i ++){
            for(j = 1 ; j <= n ; j ++){
                System.out.print(i + " * " + j + " = " + i * j);
                if(j < n){
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}