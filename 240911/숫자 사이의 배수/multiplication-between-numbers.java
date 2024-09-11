import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, i, sumVal, cnt;

        a = sc.nextInt();
        b = sc.nextInt();

        sumVal = 0;
        cnt = 0;

        for(i = a; i <= b ; i ++){
            if(i % 5 == 0 || i % 7 == 0){
                sumVal += i;
                cnt ++;
            }
        }
        System.out.print(sumVal + " ");
        System.out.print(sumVal/cnt + "." +sumVal%cnt);
        
        //System.out.printf("%d %.1f",sumVal,(double)(sumVal/cnt));
        
    }
}