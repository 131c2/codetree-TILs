import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, cnt;

        cnt = 0;

        for(;;){
            if(cnt == 3){
                break;
            }
            else{
                a = sc.nextInt();
                
                if(a % 2 == 0){
                System.out.println(a / 2);
                cnt ++;
                }
            }

        }
    }
}