import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, sumVal, cnt;

        sumVal = 0;
        cnt = 0;

        for(;;){
            a = sc.nextInt();
            if(a / 10 == 2){
                sumVal += a;
                cnt ++;
            }
            else{
                System.out.printf("%.2f",(double)sumVal/cnt);
                break;
            }
        }
    }
}