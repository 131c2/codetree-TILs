import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, i;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        boolean satisfied = false;

        for(i = a ; i <= b ; i ++){
            if(i % c == 0){
                satisfied = true;
            }
        }
        if(satisfied == true){
            System.out.print("YES");
        }
        else {
            System.out.print("NO");
        }
    }
}