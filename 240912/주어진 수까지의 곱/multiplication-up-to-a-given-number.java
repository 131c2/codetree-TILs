import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, i, prod;

        prod = 1;

        a = sc.nextInt();
        b = sc.nextInt();

        for(i = a ; i <= b ; i ++){
            prod *= i;
        }
        System.out.print(prod);
    }
}