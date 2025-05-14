package learning.EX;
import java.util.Scanner;

public class EX_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of row:");
        int size = sc.nextInt();
        for (int i = size; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print('*');
            }
            System.out.println("");
        }
    }
}
