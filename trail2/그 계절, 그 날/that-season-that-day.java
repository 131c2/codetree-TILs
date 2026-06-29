import java.util.Scanner;

public class Main {
    //윤년 체크
    public static boolean isLeap(int n){
        if(n % 400 == 0){
            return true;
        }
        if(n % 100 == 0){
            return false;
        }
        if(n % 4 == 0){
            return true;
        }
        return false;
    }
    //날짜 존재 확인
    public static boolean isThere(int y, int m, int d){
        int[] day;
        
        if(isLeap(y)){
            day = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        }else{
            day = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        }

        if(day[m] >= d){
            return true;
        }
        return false;
    }

    //계절 체크
    public static String weather(int m){
        if(m >= 3 && m <= 5){
            return "Spring";
        }else if(m >= 6 && m <= 8){
            return "Summer";
        }else if(m >= 9 && m <= 11){
            return "Fall";
        }else{
            return "Winter";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        if(isThere(y, m, d)){
            System.out.println(weather(m));
        }else{
            System.out.println(-1);
        }
    }
}