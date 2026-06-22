import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        String s = sc.next();

        int[] days = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri","Sat","Sun"};

        for(int i = 1 ; i < m1 ; i ++){
            d1 += days[i];
        }
        for(int i = 1 ; i < m2 ; i ++){
            d2 += days[i];
        }

        // int sIdx = Arrays.asList(day).indexOf(s);
        
        int sIdx = 0;
        for(int i = 0 ; i < 7 ; i++){
            if(s.equals(day[i])){
                sIdx = i;
            }
        }

        int cnt = d2 - d1;

        int idx = ((cnt % 7) + 7) % 7;

        int cnt2 = Math.abs(cnt) / 7;

        if(cnt >= 0 && idx >= sIdx ){
            cnt2 ++;            
        }
        else if(cnt < 0 && idx <= sIdx){
            cnt2 ++;
        }

        System.out.println(cnt2);
    }
}