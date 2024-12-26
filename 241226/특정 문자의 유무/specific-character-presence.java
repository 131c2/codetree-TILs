import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        
        int i, len;

        len = str.length();

        boolean ex = false;

        // constains() 이용.
        
        if(str.contains("ee")){
            ex = true;
        }

        if(ex == true){
            System.out.print("Yes" + " ");
        }
        else {
            System.out.print("No" + " ");
        }
        
        ex = false;

        if(str.contains("ab")){
            ex = true;
        }

        if(ex == true){
            System.out.print("Yes" + " ");
        }
        else {
            System.out.print("No" + " ");
        }

        /* str.substring().equals() 사용.

        for(i = 0 ; i < len - 1 ; i ++){
            if(str.substring(i, i + 2).equals("ee")){
                ex = true;
            }
        }

        if (ex == true) {
            System.out.print("Yes" + " ");
        }
        else {
            System.out.print("No" + " ");
        }

        ex = false;

        for(i = 0 ; i < len - 1 ; i ++){
            if(str.substring(i, i + 2).equals("ab")){
                ex = true;
            }
        }

        if (ex == true) {
            System.out.print("Yes" + " ");
        }
        else {
            System.out.print("No" + " ");
        }
        */
    }
}