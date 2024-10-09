import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, sum;
        double ave;

        int[] a = new int[10];

        sum = 0;
        ave = 0;

        for(i = 0 ; i < 10 ; i ++){
            a[i] = sc.nextInt();
            if(a[i] < 250){
                sum += a[i];
            }
            else{
                ave = (double)sum / i;
                break;
            }
            if(i == 9){
                ave = (double)sum / i;
            }
        }
        System.out.printf("%d %.1f",sum , ave);
    }
}