import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i, prod;

        prod = 1;

        n = sc.nextInt();

        for(i = 1 ; i <= 10 ; i ++){
            prod *= i;
            if(prod >= n){
                break;
            }
        }
        System.out.print(i);
    }
}