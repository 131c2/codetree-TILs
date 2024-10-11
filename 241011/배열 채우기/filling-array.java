import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;

        int[] a = new int[10];

        for(i = 0 ; i < 10 ; i ++){
            a[i] = sc.nextInt();

            if(a[i] == 0){
                break;
            }
        }
        for(i = 9 ; i >= 0 ; i --){
            if(a[i] != 0){
                System.out.print(a[i] + " ");
            }

        }

    }
}