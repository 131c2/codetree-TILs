import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;

        int[] a = new int[100];
        int[] cntA = new int[10];

        for(i = 0 ; i < 10 ; i ++){
            cntA[i] = 0;
        }

        for(i = 0 ; i < 100 ; i ++){
            a[i] = sc.nextInt();
            if(a[i] == 0){
                break;
            }
        }

        for(i = 0 ; i < 100 ; i++){
            cntA[a[i] / 10] ++;
        }

        for(i = 1 ; i < 10 ; i ++){
            System.out.println(i + " - " + cntA[i]);
        }
    }
}