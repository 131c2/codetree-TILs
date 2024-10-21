import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, i, idx, cnt;

        idx = -1;
        cnt = 0;
    
        int[] a = new int[100];
        int[] b = new int[100];

        n1 = sc.nextInt();
        n2 = sc.nextInt();

        for(i = 0 ; i < n1 ; i ++){
            a[i] = sc.nextInt();
        }
        for(i = 0 ; i < n2 ; i ++){
            b[i] = sc.nextInt();
        }

        for(i = 0 ; i < n1 ; i ++){
            if(a[i] == b[0]){
                idx = i;
                break;
            }
        }
        if(idx != -1){
            for(i = 0 ; i < n2 ; i ++){
                if(a[idx + i] == b[i]){
                    cnt ++;
                }
            }
            if(cnt == n2){
                System.out.print("Yes");
            }
            else{
                System.out.print("No");
            }

        }
        else{
            System.out.print("No");
        }
        

    }
}