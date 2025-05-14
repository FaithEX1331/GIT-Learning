package learning;
import java.util.Scanner;

public class PR_22 {
    static int factorial(int n){
        if(n == 0 || n == 1) return 1;
        else return n * factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.printf("The factorial of %d is: %d", num, factorial(num));
    }
}
