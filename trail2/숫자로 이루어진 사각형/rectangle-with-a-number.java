import java.util.Scanner;

public class Main {
    public static void number(int n){
        int cnt = 1;
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                if(cnt % 10 == 0){
                    cnt ++;
                }
                System.out.print(cnt % 10 + " ");
                cnt ++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        number(n);
    }
}