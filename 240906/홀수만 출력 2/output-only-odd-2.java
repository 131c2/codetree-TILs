import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, i;

        b = sc.nextInt();
        a = sc.nextInt();
    

        for(i = b ; i >= a ; i -= 2){
            System.out.print(i + " ");
        }
    }
}