package learning.EX;
import java.util.Scanner;

public class EX_23 {
    static void multitable (int n)
    {
        for (int i = 1; i < 11; i++){
            System.out.format("%d X %d = %d\n", n, i, n*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.format("The Multiplication Table of %d is:\n",num);
        multitable(num);
    }
}
