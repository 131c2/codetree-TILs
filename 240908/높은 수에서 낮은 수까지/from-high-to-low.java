import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, i;

        a = sc.nextInt();
        b = sc.nextInt();

        if(a > b){
            for(i = a ; i >= b ; i --){
                System.out.print(i + " ");
            }
        }
        else {
            for(i = b ; i >= a ; i --){
                System.out.print(i + " ");
            }
        }
    }
}