import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1;
        str1 = sc.next();

        char[] cArr = new char[1000];
        int[] arr = new int[1000];

        int idx, i, len, cnt, cnt2, n;
        n = 0;
        cnt = 0;
        cnt2 = 0;
        idx = 0;
        len = str1.length();

        cArr[cnt2] = str1.charAt(0);

        for(i = 0 ; i < len ; i ++){
            if(str1.charAt(idx) == str1.charAt(i)){
                cnt ++;
            }
            else{
                idx = i;
                arr[cnt2] = cnt;
                cnt = 1;
                cnt2 ++;
                cArr[cnt2] = str1.charAt(i);
            }
        }
        arr[cnt2] = cnt;

        for(i = 0 ; i <= cnt2 ; i ++){
            n ++;
            if(arr[i] >= 100){
                n += 3;
            }
            else if(arr[i] >= 10){
                n += 2;
            }
            else{
                n ++;
            }
        }
        System.out.println(n);

        for(i = 0 ; i <= cnt2 ; i ++){
            System.out.print(cArr[i]);
            System.out.print(arr[i]);
        }
    }
}