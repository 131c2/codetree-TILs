import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a == 11 && ((b == 11 && c < 11) || (b < 11))){
            System.out.println(-1);
        }
        else{
            System.out.println((a*24*60 + b * 60 + c) - (11*24*60 + 11*60 + 11));
        }

    }
}