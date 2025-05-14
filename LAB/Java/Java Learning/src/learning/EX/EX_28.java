package learning.EX;

public class EX_28 {
    static void starrec(int n){
        if(n>0){
            starrec(n-1);
            for (int i = 1; i <= n; i++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        starrec(5);
    }
}
