import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, i, cnt1, cnt2;
        
        cnt1 = 0;
        cnt2 = 0;

        for(i = 1 ; i <= 10 ; i++){
            a = sc.nextInt();
            if(a % 3 == 0){
                cnt1 ++;
            }
            if(a % 5 == 0){
                cnt2 ++;
            }
        }
        System.out.print(cnt1 + " " + cnt2);
    }
}