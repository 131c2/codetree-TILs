import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, i, j;

        boolean satisfied = false;

        a = sc.nextInt();
        b = sc.nextInt();

        for(i = 1 ; i <= 2880 ; i ++){
            if(2880 % i == 0){
                for(j = 1 ; j <= 1920 ; j++){
                    if(1920 % j == 0){
                        if(j >= a && j <= b){
                            satisfied = true;
                            break;
                        }
                    }
                }
            }            
        }
        if(satisfied == true){
            System.out.print(1);
        }
        else {
            System.out.print(0);
        }
    }
}