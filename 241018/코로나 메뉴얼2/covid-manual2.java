import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;

        char[] a = new char[3];
        int[] b = new int[3];
        int[] cnt = new int[4];

        for(i = 0 ; i < 4 ; i ++){
            cnt[i] = 0;
        }
        
        for(i = 0 ; i < 3 ; i ++){
            a[i] = sc.next().charAt(0);
            b[i] = sc.nextInt();
        }

        for(i = 0 ; i < 3 ; i ++){
            if(a[i] == 'Y' && b[i] >= 37){
                cnt[0] ++;
            }
            else if(a[i] == 'N' && b[i] >= 37){
                cnt[1] ++;
            }
            else if(a[i] == 'Y'){
                cnt[2] ++;
            }
            else{
                cnt[3] ++;
            }
        }

        System.out.printf("%d %d %d %d ",cnt[0] ,cnt[1] ,cnt[2] ,cnt[3]);
        
        if(cnt[0] >= 2){
            System.out.print("E");
        }
        
    }
}