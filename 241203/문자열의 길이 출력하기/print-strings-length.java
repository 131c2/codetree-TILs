import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1, str2;
        str1 = sc.next();
        str2 = sc.next();

        System.out.print(str1.length() + str2.length());
    }
}