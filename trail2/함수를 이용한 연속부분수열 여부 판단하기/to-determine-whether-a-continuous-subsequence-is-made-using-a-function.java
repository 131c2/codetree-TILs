import java.util.Scanner;
public class Main {
    public static boolean isMatch(int[] a, int[] b, int n1, int n2){
        for(int i = 0 ; i <= n1 - n2 ; i ++){
            if(a[i] == b[0]){
                boolean check = true;
                for(int j = 0 ; j < n2 ; j ++){
                    if(a[i+j] != b[j]){
                        check = false;
                        break;
                    }
                }
                if(check){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        
        if(isMatch(a, b, n1, n2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}