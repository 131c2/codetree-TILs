import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i, sumVal;

        sumVal = 0;

        n = sc.nextInt();

        for(i = 1; i <= 100 ; i ++){
            sumVal += i;
            if(sumVal >= n){
                break;
            }             
        }
        System.out.print(i);

    }
}