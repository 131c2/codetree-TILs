import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, i, j;

        a = sc.nextInt();
        b = sc.nextInt();

        for(i = 2 ; i <= 8 ; i += 2){
            for(j = b ; j >= a ; j --){
                System.out.print(j + " * " + i + " = " + j * i);
                if(j > a){
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }
    }
}