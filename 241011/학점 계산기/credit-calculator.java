import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i;

        double sum, ave;

        sum = 0;

        ave = 0;

        n = sc.nextInt();

        double[] a = new double[n];
        
        for(i = 0 ; i < n ; i ++){
            a[i] = sc.nextDouble();
            sum += a[i];
        }
        ave = sum / n;
        System.out.printf("%.1f\n", ave);
        if(ave >= 4.0){
            System.out.print("Perfect");
        }
        else if(ave >= 3.0){
            System.out.print("Good");
        }
        else{
            System.out.print("Poor");
        }
    }
}