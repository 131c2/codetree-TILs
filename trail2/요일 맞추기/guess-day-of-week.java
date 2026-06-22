import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int[] days = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = new String[] {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat","Sun"};

        int cnt = 0;

        for(int i = 1 ; i < m1 ; i ++){
            d1 += days[i];
        }

        for(int i = 1 ; i < m2 ; i ++){
            d2 += days[i];
        }

        cnt = d2 - d1;

        int idx = ((cnt % 7) + 7) % 7;

        System.out.println(day[idx]);

        // cnt = d2 - d1;

        // if(cnt >= 0){
        //     System.out.println(day[cnt % 7 + 1]);
        // }
        // else{
        //     cnt = Math.abs(cnt);
        //     System.out.println(cnt%7 == 0 ? day[cnt % 7 + 1 ] : day[8- cnt % 7]);

        // }
    }
}