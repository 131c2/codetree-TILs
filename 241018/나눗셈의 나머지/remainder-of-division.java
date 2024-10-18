import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, i, x;

        x = 0;

        a = sc.nextInt();
        b = sc.nextInt();

        int[] arr = new int[1000];
        int[] cntA = new int[1000];

        for(i = 0 ; i < 1000 ; i ++){
            cntA[i] = 0;
        }

        for(i = 0 ; i < 1000 ; i ++){
            arr[i] = a % b;
            a /= b;

            cntA[arr[i]] ++;
            
            if(a <= 1){
                break;
            }
        }

        for(i = 0 ; i < 1000 ; i ++){
            x += (cntA[i] * cntA[i]);
        }
        System.out.print(x);
    }
}