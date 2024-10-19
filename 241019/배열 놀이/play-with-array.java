import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, q, i, j, idx, b, c, d, s, e;

        n = sc.nextInt();
        q = sc.nextInt();

        int[] a = new int[n];

        for(i = 0 ; i < n ; i ++){
            a[i] = sc.nextInt();
        }
        
        for(i = 0 ; i < q ; i ++){
            b = sc.nextInt();
            if(b == 1 || b == 2){
                if(b == 1){
                    c = sc.nextInt();
                    System.out.print(a[c - 1]);
                }
                else{
                    idx = -1;
                    d = sc.nextInt();
                    for(j = 0 ; j < n ; j ++){
                        if(a[j] == d){
                            idx = j;
                            break;
                        }
                    }
                    if(idx == -1){
                        System.out.print(0);
                    }
                    else{
                        System.out.print(idx + 1);
                    }
                }
            }
            else{
                s = sc.nextInt();
                e = sc.nextInt();
                for(j = s ; j <= e ; j ++){
                    System.out.print(a[j - 1] + " ");
                }
            }
            System.out.println();
        }
    }
}