import java.util.Scanner;

public class Main {
    public static boolean match(int n){
        while(n > 0){
            int digit = n % 10;
            if(digit == 3 || digit == 6 || digit == 9) return true;
            n /= 10;
        }
        return false;
    }
    
    /*
    public static boolean match(int n){

        boolean check = false;

        while(true){
            if(n % 10 == 3 || n % 10 == 6 || n % 10 == 9){
                check = true;
                break;
            }else if(n / 10 == 0){
                break;
            }
            n /= 10;
        }
        return check;
    }
    */

    public static boolean isMagicNum(int n){
        return n % 3 == 0 || match(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;

        for(int i = a ; i <= b ; i ++){
            if(isMagicNum(i)){
                cnt ++;
            }
        }

        System.out.println(cnt);

    }
}