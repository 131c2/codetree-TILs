import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i, cnt, sum;

        cnt = 0;
        sum = 0;
        
        n = sc.nextInt();

        String[] str = new String[n];

        for(i = 0 ; i < n ; i ++){
            str[i] = sc.next();
        }

        char str2 = sc.next().charAt(0);

        for(i = 0 ; i < n ; i ++){
            if(str[i].charAt(0) == str2){
                cnt ++;
                sum += str[i].length();
            }
        }
        System.out.print(cnt + " ");
        System.out.printf("%.2f",(double)sum/cnt);
    }
}