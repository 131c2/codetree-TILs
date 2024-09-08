import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, n, i;

        a = sc.nextInt();
        n = sc.nextInt();

        for(i = 1 ; i <= n ; i++) {
            
            System.out.println(a + (n * i));
        }
    }
}