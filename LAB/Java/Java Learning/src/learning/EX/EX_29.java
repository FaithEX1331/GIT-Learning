package learning.EX;

public class EX_29 {
    static void starRevRec(int n){
        if(n>0){
            for(int i = 0; i<n; i++){
                System.out.print('*');
            }
            System.out.println();
            starRevRec(n-1);
        }
    }
    public static void main(String[] args) {
        starRevRec(4);
    }
}
