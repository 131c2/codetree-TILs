public class Main {
    public static void main(String[] args) {
        
        int i, j;

        for(i = 1 ; i <= 19 ; i ++){
            for(j = 1 ; j <= 19 ; j ++){
                System.out.printf("%d * %d = %d",i ,j, i * j);
                if(j % 2 != 0 && j < 19){
                System.out.print(" / ");
                }
                else{
                    System.out.println();
                }
            }            
        }
    }
}