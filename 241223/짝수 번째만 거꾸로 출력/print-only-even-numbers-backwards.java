import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str, str2;
        str = sc.next();
        str2 = "";

        int i, n;
        n = str.length();
        
        if(n % 2 == 0){
            for(i = n - 1 ; i >= 0 ; i -= 2){
                str2 += str.charAt(i);
            }
        }
        else{
            for(i = n - 2 ; i >= 0 ; i -= 2){
                str2 += str.charAt(i);
            }
        }
        System.out.print(str2);
    }
}