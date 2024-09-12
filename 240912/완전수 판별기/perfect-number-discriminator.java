import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i, sumVal;

        n = sc.nextInt();
        sumVal = 0;

        for(i = 1 ; i <= n ; i ++){
            if(n % i == 0 && i != n){
                sumVal += i;
            }
        }
        if(sumVal == n){
            System.out.print("P");
        }
        else {
            System.out.print("N");
        }
    }
}