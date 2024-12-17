import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;
        int i;

        str = sc.nextLine();

        for(i = 2 ; i < 10 ; i ++){
            System.out.print(str.charAt(i));
        }
    }
}