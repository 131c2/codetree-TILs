import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i;

        n = sc.nextInt();

        i = 1;

        while(i <= n){
            System.out.print(i + " ");
            i++;
        }
    }
}