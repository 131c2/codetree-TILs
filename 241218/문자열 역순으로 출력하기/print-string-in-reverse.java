import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = new String[4];

        int i;

        for(i = 0 ; i < 4 ; i ++){
            str[i] = sc.next();
        }
        for(i = 3 ; i >= 0 ; i --){
            System.out.println(str[i]);
        }
    }
}