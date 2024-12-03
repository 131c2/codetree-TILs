import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1, str2;
        int a, b;

        str1 = sc.next();
        str2 = sc.next();

        a = str1.length();
        b = str2.length();

        if(a == b){
            System.out.print("same");
        }
        else if(a > b){
            System.out.print(str1 + " " + a);
        }
        else{
            System.out.print(str2 + " " + b);
        }
    }
}