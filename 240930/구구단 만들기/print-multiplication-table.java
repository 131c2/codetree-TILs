import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, i, j;

        a = sc.nextInt();
        b = sc.nextInt();

        for(i = 1 ; i <= 9 ; i ++){
            for(j = b ; j >= a ; j -= 2){
                System.out.print(j + " * " + i + " = " + j * i);
                if(j > a){
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }
    }
}