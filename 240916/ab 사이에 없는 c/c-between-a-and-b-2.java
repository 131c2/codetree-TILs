import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, i;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        boolean satisfied = true;

        for(i = a ; i <= b ; i ++){
            if(i % c == 0){
                satisfied = false;
                break;
            }
        }
        if(satisfied == false){
            System.out.print("NO");
        }
        else {
            System.out.print("YES");
        }
    }
}