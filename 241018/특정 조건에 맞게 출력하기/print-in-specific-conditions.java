import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;

        int[] a = new int[100];

        for(i = 0 ; i < 100 ; i ++){
            a[i] = sc.nextInt();
            if(a[i] == 0){
                break;
            }
            else if(a[i] % 2 == 0){
                System.out.print(a[i] / 2 + " ");
            }
            else {
                System.out.print(a[i] + 3 + " ");
            }
        }
    }
}