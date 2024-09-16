import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i;

        n = sc.nextInt();

        boolean satisfied = true;

        for(i = 2 ; i < n ; i ++){
            if(n % i == 0){
                satisfied = false;
                break;
            }
        }
        if(satisfied == false){
            System.out.print("C");
        }
        else {
            System.out.print("P");
        }
    }
}