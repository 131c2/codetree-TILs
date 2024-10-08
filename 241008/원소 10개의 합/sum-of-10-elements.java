import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum, i;
        int[] arr = new int[10];
        
        sum = 0;
        
        for (i = 0; i <= 9; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.print(sum);
    }
}