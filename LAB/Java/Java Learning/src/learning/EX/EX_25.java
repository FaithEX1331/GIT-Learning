package learning.EX;

public class EX_25 {
    static int sumRec(int n){
        if (n==1) return 1;
        else return n + sumRec(n-1);

    }

    public static void main(String[] args) {
        int sum = sumRec(10);
        System.out.println(sum);
    }
}
