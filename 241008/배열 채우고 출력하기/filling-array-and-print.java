import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;
        char[] arr = new char[10];

        for(i = 0 ; i < 10 ; i ++){
            arr[i] = sc.next().charAt(0);
        }
        for(i = 9 ; i >= 0 ; i --){
            System.out.print(arr[i]);
        }
    }
}