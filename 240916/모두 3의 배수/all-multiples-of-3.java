import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, i;
        boolean satisfied = true;

        for(i = 1 ; i <= 5 ; i ++){
            a = sc.nextInt();
            if(a % 3 != 0){
                satisfied = false;
                break;
            }
        }
        if(satisfied == true){
            System.out.print(1);
        }
        else{
            System.out.print(0);
        }
    }
}