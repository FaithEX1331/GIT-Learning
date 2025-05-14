package learning.EX;

public class EX_31 {
    static int sumtill(int n){
        int sum = 0;
        for (int i = n; i>0; i--){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumtill(5));
    }
}
