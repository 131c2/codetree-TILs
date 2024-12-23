import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, n;

        n = sc.nextInt();

        String str = "";

        for(i = 0 ; i < n ; i ++){
            str += sc.next();
        }

        System.out.print(str);
    }
}