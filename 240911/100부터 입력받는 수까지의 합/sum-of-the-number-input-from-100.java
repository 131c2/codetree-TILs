import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i, sumVal;

        n = sc.nextInt();

        sumVal = 0;

        for(i = n ; i <= 100 ; i++){
            sumVal += i;
        }
        System.out.print(sumVal);
    }
}