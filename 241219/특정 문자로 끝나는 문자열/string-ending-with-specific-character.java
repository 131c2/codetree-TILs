import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] sarr = new String[10];
        int[] arr = new int[10];

        int i, cnt;
        cnt = 0;

        for(i = 0 ; i < 10 ; i ++){
           sarr[i] = sc.next();
           arr[i] = sarr[i].length();
        }

        char str = sc.next().charAt(0);

        for(i = 0 ; i < 10 ; i ++){
            if(sarr[i].charAt(arr[i] - 1) == str){
                System.out.println(sarr[i]);
                cnt ++;
            }
        }

        if(cnt == 0){
            System.out.print("None");
        }


    }
}