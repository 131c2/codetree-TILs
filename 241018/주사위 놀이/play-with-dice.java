import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;

        int[] a = new int[10];
        int[] cntA = new int[7];

        for(i = 0 ; i < 7 ; i ++){
            cntA[i] = 0;
        }

        for(i = 0 ; i < 10 ; i ++){
            a[i] = sc.nextInt();
        }

        for(i = 0 ; i < 10 ; i ++){
            cntA[a[i]] ++;
        }

        for(i = 1 ; i < 7 ; i ++){
            System.out.println(i + " - " + cntA[i]);
        }
    }
}