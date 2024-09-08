import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, i;

        a = sc.nextInt();
        b = sc.nextInt();        

        System.out.print((a/b)+"."); // 0.
        
        i = 1;
        
        while(i <= 20) {
            a %= b; //a = 3
            a *= 10; // a = 30, b= 5
            System.out.print(a/b);
            
            i++;
        }
    }
}