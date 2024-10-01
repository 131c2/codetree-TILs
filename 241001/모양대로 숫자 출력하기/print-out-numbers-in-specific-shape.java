import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, k, n;

        n = sc.nextInt();

        for(i = n ; i >= 1 ; i --){
            if(i < n){
                for(j = i ; j < n ; j ++){
                    System.out.print("  ");
                }
            }
            for(j = i ; j >= 1 ; j --){
                System.out.print(j + " ");
            }
            System.out.println();
        }       
    }
}