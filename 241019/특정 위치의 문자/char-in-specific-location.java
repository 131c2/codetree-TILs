import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i,idx;

        char[] a = new char[] {'L', 'E', 'B', 'R', 'O', 'S'};

        char b;
        b = sc.next().charAt(0);

        idx = -1;

        for(i = 0 ; i < 6 ; i ++){
            if(a[i] == b){
                idx = i;
            }
        }
        if(idx == -1){
            System.out.print("None");
        }
        else{
            System.out.print(idx);
        }
    }
}