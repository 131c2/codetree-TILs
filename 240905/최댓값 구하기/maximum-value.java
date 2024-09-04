import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        /* sol-1
        if(a >= b && a >= c){
            System.out.println(a);
        }
        else if(b >= a && b >= c){
            System.out.println(b);
        }
        else if(c >= a && c >= b){
            System.out.println(c);
        }
        */

        // sol-2 중첩 조건문 사용
        if(a >= b) {
            if(a >= c){
                System.out.println(a);
            }
            else{
                System.out.println(c);
            }
        }
        else{
            if(b >= c){
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }
        }
    }
}