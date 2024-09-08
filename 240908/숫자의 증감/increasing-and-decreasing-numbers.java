import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);
        int n, i;
        n = sc.nextInt();

        if(c == 'A') {
            for(i = 1; i <= n ; i++){
                System.out.print(i + " ");
            }
        }
        else if(c == 'D'){
            for(i = n; i >= 1; i--){
                System.out.print(i + " ");
            }
        }
    }
}