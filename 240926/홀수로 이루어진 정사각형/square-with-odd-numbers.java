import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i, j;

        n = sc.nextInt();
        
        for(i = 1 ; i < n * 2; i += 2){
            for(j = i ; j < n * 2 + i; j += 2){
                System.out.print(10 + j + " ");
            }
            System.out.println();
        }
    }
}