package learning.EX;
import java.util.Scanner;

public class EX_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;
        while(n>0){
            sum += n;
            n--;
        }
        System.out.printf("The sum is: %d", sum);

    }
}
