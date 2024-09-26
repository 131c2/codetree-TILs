import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, i, j;

        a = sc.nextInt();
        b = sc.nextInt();

        for(i = 1 ; i <= a ; i ++){
            for(j = 1 ; j <= b ; j ++){
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}