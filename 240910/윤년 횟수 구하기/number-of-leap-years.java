import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i, cnt;

        n = sc.nextInt();

        cnt = 0;

        i = 1;
        
        while (i <= n){
            if((i % 100 == 0) && (i % 400 != 0)){
                i++;
            }
            else if(i % 4 == 0) {
                cnt++;
                i++;
            }
            else {
                i++;
            }
        }
        System.out.print(cnt);
    }
}