import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i, cnt;

        cnt = 0;

        n = sc.nextInt();

        int[] a = new int[100];

        for(i = 0 ; i < 100 ; i ++){
            a[i] = n * (i + 1);
            
            if(cnt == 2){
                break;
            }
            else if(a[i] % 5 == 0){
                cnt ++;
            }
            
            System.out.print(a[i] + " ");
        }
    }
}