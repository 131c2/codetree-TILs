import java.util.Scanner;

public class Main {
    public static boolean isThere(int m, int d){
        int[] day = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(m > 12){
            return false;
        }else if(day[m] >= d){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();

        if(isThere(m, d)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}