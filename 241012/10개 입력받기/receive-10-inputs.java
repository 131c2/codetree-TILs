import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, sum;

        sum = 0;

        double ave;
        ave = 0;

        int[] a = new int[10];

        for(i = 0 ; i < 10 ; i ++){
            a[i] = sc.nextInt();
            if(a[i] == 0){
                ave = (double)sum / i;
                break;
            }
            else{
                sum += a[i];
                ave = (double)sum / (i+1);
            }            
        }
        System.out.printf("%d %.1f",sum, ave);
    }
}