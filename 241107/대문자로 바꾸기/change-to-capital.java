import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j;

        char[][] a = new char[5][3];

        for(i = 0 ; i < 5 ; i ++){
            for(j = 0 ; j < 3 ; j ++){
                a[i][j] = sc.next().charAt(0);
                System.out.print((char)((int)a[i][j]-32) + " ");
            }
            System.out.println();
        }
    }
}