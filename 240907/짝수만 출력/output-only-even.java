import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, i;

        a = sc.nextInt();
        b = sc.nextInt();

        i = a;

        while(i <= b){
            System.out.print(i + " ");
            i += 2;
        }

    }
}