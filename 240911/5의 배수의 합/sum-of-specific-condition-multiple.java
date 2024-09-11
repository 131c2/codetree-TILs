import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, i, sumVal;

        a = sc.nextInt();
        b = sc.nextInt();

        sumVal = 0;

        if(a > b){
            for(i = b ; i <= a ; i ++){
                sumVal += i;
            }
        }
        else {
            for(i = a ; i >= b ; i ++){
                sumVal += i;
            }
        }
        System.out.print(sumVal);
    }
}