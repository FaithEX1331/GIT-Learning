package learning.School.Class_2;
import java.util.Scanner;

public class P_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a>b && a>c) System.out.printf("The largest number is: %d\n",a);
        else if (b>a && b>c)  System.out.printf("The largest number is: %d\n",b);
        else  System.out.printf("The largest number is: %d\n",c);
    }
}
