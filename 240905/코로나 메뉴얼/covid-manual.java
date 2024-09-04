import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tem1, tem2, tem3;
        char symp1, symp2,symp3;

        symp1 = sc.next().charAt(0);
        tem1 = sc.nextInt();
        symp2 = sc.next().charAt(0);
        tem2 = sc.nextInt();
        symp3 = sc.next().charAt(0);
        tem3 = sc.nextInt();
        

        if(symp1 == 'Y' && tem1 >= 37){
            if(symp2 == 'Y' && tem2 >= 37 ||symp3 == 'Y' && tem3 >= 37 ){
                System.out.println("E");
            }
            else{
                System.out.println("N");
            }
        }
        else{
            if(symp2 == 'Y' && tem2 >= 37 && symp3 == 'Y' && tem3 >= 37 ){
                System.out.println("E");
            }
            else{
                System.out.println("N");
            }
        }
    }
}