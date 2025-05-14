package learning.EX;
import java.util.Scanner;

public class EX_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no 1:");
        float a = sc.nextFloat();
        System.out.print("Enter no 2:");
        float b = sc.nextFloat();
        System.out.print("Enter no 3:");
        float c = sc.nextFloat();

        float sum = a+b+c;
        System.out.printf("The sum is: %.2f", sum);
    }
}
