import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int i;

        for(i = 0 ; i < str.length() ; i ++){
            System.out.println(str.charAt(i));
        }
    }
}