import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1, str2, str3;
        int a, b, c;
        str1 = sc.next();
        str2 = sc.next();
        str3 = sc.next();

        a = str1.length();
        b = str2.length();
        c = str3.length();

        if(a >= b && b >= c){
            System.out.print(a - c);
        }
        else if(b >= a && a >= c){
            System.out.print(b - c);
        }
        else if(a >= c && c >= b){
            System.out.print(a - b);
        }
        else if(c >= a && a >= b){
            System.out.print(c - b);
        }
        else if(b >= c && c >= a){
            System.out.print(b - a);
        }
        else if(c >= b && b >= a){
            System.out.print(c - a);
        }
    
    }
}