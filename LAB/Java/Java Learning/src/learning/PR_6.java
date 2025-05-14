package learning;
import java.util.Scanner;

public class PR_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 10;
        int b = 5;
        int c = sc.nextInt();

        //Arithmetic operator
        int sum = a+b;
        int sub = a-b;
        int prod = a*b;
        int div = a/b;
        int mod = a%c;
        double modf = 4.8%1.1;
//        System.out.println(modf);

        //Assignment operator
        int d = 12;
        d += 4;
        d *= 4;
        d -= 4;
        d /= 4;

        //Comparison operator
        System.out.println(6>=c);
        System.out.println(10<=c);
        System.out.println(12==c);

        //Logical operator
        System.out.println(12>6 && 13<8);
        System.out.println(12>6 || 13<8);

        //Bitwise operator
        System.out.println(2&3);
        System.out.println(2|3);
    }
}
