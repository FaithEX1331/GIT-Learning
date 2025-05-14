package learning.EX;
import java.util.Scanner;

public class EX_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean b1 = sc.hasNextInt();
        if (b1) System.out.println("It is an integer.");
        else System.out.println("It is not an integer.");
    }
}
