import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, i, a;

        N = sc.nextInt();

        for(i = 1 ; i <= N ; i ++){
            a = sc.nextInt();
            if(a % 2 == 1 && a % 3 == 0){
                System.out.println(a);
            }
            
        }

        
    }
}