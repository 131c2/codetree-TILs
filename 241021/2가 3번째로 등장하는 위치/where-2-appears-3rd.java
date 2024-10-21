import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i, idx, cnt;

        n = sc.nextInt();
        
        idx = -1;
        cnt = 0;

        int[] a = new int[n];
        
        for(i = 0 ; i < n ; i ++){
            a[i] = sc.nextInt();

            if(a[i] == 2){
                cnt ++;
            }
            if(cnt == 3){
                idx = i;
                break;
            }
        }
        System.out.print(idx + 1);
    }
}