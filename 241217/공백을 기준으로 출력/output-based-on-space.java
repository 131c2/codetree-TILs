import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1, str2;

        str1 = sc.nextLine();
        str2 = sc.nextLine();

        int i;

        for(i = 0 ; i < str1.length() ; i ++){
            if(str1.charAt(i) != ' '){
                System.out.print(str1.charAt(i));
            }
        }
        for(i = 0 ; i < str2.length() ; i ++){
            if(str2.charAt(i) != ' '){
                System.out.print(str2.charAt(i));
            }
        }
    }
}