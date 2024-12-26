import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        
        char str2 = sc.next().charAt(0);

        int n = str1.indexOf(str2);

        if(n == -1){
            System.out.print("No");
        }
        else{
            System.out.print(n);
        }
    }
}