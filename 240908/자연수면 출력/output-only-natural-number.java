import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, i;

        a = sc.nextInt();
        b = sc.nextInt();

        if(a > 0) {
            for(i = 1; i <= b ; i++){
                System.out.print(a);
            }
        }
        else {
            System.out.print(0);
        }
    }
}