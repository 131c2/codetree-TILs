import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i;

        n = sc.nextInt();

        i = n;

        while(i >= 1){
            System.out.print(i + " ");
            i--;
        }
    }
}