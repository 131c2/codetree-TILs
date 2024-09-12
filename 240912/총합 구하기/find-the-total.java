import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, i, sumVal;

        a = sc.nextInt();
        b = sc.nextInt();

        sumVal = 0;

        for(i = a ; i <= b ; i ++){
            if(i % 6 == 0 && i % 8 != 0){
                sumVal += i;
            }
        }
        System.out.print(sumVal);
    }
}