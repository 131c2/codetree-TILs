import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i, j;

        n = sc.nextInt();

        for(i = n ; i >= 1 ; i --){
            for(j = n ; j >= 1 ; j --){
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }
    }
}