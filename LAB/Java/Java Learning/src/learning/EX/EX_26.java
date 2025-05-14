package learning.EX;

public class EX_26 {
    static void starrev(int n){
        for (int i = n; i > 0; i-- ){
            for (int j = i; j > 0; j--){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        starrev(3);
    }
}
