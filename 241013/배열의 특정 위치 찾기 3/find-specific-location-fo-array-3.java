import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, sum;

        sum = 0;
        
        int[] a = new int[100];

        for(i = 0 ; i < 100 ; i ++){
            a[i] = sc.nextInt();
            if(a[i] == 0){
                for(j = (i - 1) ; j >= (i - 3) ; j --){
                    sum += a[j];
                }
                break;
            }
        }
        System.out.print(sum);
    }
}