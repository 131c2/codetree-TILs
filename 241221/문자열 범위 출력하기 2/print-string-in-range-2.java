import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int i, n;

        n = sc.nextInt();

        if(str.length() >= n){
            for(i = str.length() - 1 ; i >= str.length() - n ; i --){
                System.out.print(str.charAt(i));
            }
        }
        else{
            for(i = str.length() - 1 ; i >= 0 ; i --){
                System.out.print(str.charAt(i));
            }
        }
    }
}