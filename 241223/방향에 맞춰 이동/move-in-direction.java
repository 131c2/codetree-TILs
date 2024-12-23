import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, x, y, dir, i, a;
        char str;

        x = 0;
        y = 0;

        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, -1, 0, 1};

        N = sc.nextInt();

        for(i = 0 ; i < N ; i ++){
            str = sc.next().charAt(0);
            a = sc.nextInt();

            if(str == 'E'){
                dir = 0;
            }
            else if(str == 'S'){
                dir = 1;
            }
            else if(str == 'N'){
                dir = 3;
            }
            else{
                dir = 2;
            }
            x += dx[dir] * a;
            y += dy[dir] * a;
        }
        System.out.print(x + " " + y);
    }
}