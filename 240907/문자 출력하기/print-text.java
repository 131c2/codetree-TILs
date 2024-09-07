import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;
        char a = sc.next().charAt(0);

        for(i = 1 ; i <= 8 ; i++){
            System.out.print(a);
        }
    }
}