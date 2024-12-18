import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = new String[]{"apple", "banana", "grape", "blueberry", "orange"};

        char str2 = sc.next().charAt(0);

        int i, cnt;
        cnt = 0;

        for(i = 0 ; i < 5 ; i ++){
            if(((str[i].charAt(2)) == str2) || ((str[i].charAt(3)) == str2)){
                System.out.println(str[i]);
                cnt ++;
            }
        }
        System.out.print(cnt);

    }
}