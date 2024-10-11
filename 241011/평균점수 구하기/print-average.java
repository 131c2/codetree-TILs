import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;
        double sum = 0;
        double[] a = new double[8];

        for(i = 0 ; i < 8 ; i ++){
            a[i] = sc.nextDouble();
            sum += a[i];
        }
        System.out.printf("%.1f",sum / 8);
    }
}