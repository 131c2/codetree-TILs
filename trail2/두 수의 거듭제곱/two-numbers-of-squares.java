import java.util.Scanner;

public class Main {
    public static int exp(int a, int b){
        int power = a;

        for(int i = 1 ; i < b ; i ++){
            power *= a;
        }
        return power;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(exp(a, b));
    }
}