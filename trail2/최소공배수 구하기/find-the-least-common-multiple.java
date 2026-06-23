import java.util.Scanner;

public class Main {
    public static void lcm(int n, int m){
        int gcp = 1;

        for(int i = 1; i <= Math.min(n, m); i ++){
            if(n % i == 0 && m % i == 0){
                gcp = i;
            }
        }
        int result = (n * m) / gcp;
        
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        lcm(n, m);
        // Please write your code here.
    }
}