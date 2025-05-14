package learning.EX;
import java.util.Scanner;

public class EX_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String st= sc.nextLine();
        System.out.printf("Hello %s, have a good day!",st);
    }
}
