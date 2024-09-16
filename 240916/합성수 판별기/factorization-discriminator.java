import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n, i;

        boolean satisfied = false;

        n = sc.nextInt();

        for(i = 2 ; i < n ; i ++){
            if(n % i == 0){
                satisfied = true;
                break;
            }
        }
        if(satisfied == true){
            System.out.print("C");
        }
        else{
            System.out.print("N");
        }
    }
}