import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] sarr = new String[10];

        int i;

        for(i = 0 ; i < 10 ; i ++){
            sarr[i] = sc.next();
        }
        for(i = 9 ; i >= 0 ; i --){
            System.out.println(sarr[i]);
        }
    }
}