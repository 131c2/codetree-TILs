import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1, str2, A, B;
        
        boolean ans = false;

        int i, n;

        str1 = sc.next();
        str2 = sc.next();
        A = str1 + str2;
        B = str2 + str1;

        n = str1.length() + str2.length();

        for(i = 0; i < n ; i ++){
            if(A.charAt(i) == B.charAt(i)){
                ans = true;
            }
            else{
                ans = false;
            }
        }
        if(ans == true){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
    }
}