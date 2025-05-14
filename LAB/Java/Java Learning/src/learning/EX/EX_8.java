package learning.EX;
import java.util.Scanner;


public class EX_8 {
    public static void main(String[] args) {
        int gNum = 10;
        Scanner sc = new Scanner(System.in);
        int iNum = sc.nextInt();
        boolean b1 = gNum>iNum;
        System.out.println("Is the given number greater than the input number? "+ b1);

    }
}
