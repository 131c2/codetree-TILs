import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, n, sum, ave, cnt;
        
        ave = 0;
        cnt = 0;

        n = sc.nextInt();

        int[] arr = new int[4];
        
        for(i = 0 ; i < n ; i ++){
            sum = 0;
            for(j = 0 ; j < 4 ; j ++){
                arr[j] = sc.nextInt();
                sum += arr[j];
            }
            ave = sum / 4;
            if(ave >= 60){
                System.out.println("pass");
                cnt++;
            }
            else{
                System.out.println("fail");
            }
        }
        System.out.println(cnt);
    }
}