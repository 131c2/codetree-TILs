import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;
        char[] a = new char[10];

        for(i = 0 ; i < 10 ; i ++){
            a[i] = sc.next().charAt(0);
        }
        System.out.printf("%s %s %s",a[1] ,a[4], a[7]);
    }
}