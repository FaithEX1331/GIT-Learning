package learning.EX;
import java.util.Scanner;

public class EX_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        float [] num = {12.45f, 34.67f, 23.34f};
        float sum = 0;
        for (float nu: num){
            sum += nu;
        }
        System.out.printf("The sum is: %.2f", sum);
    }
}
