package learning.EX;
import java.util.Scanner;

public class EX_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income in lakh: ");
        double inc = sc.nextDouble();
        if (inc>=2.5 && inc<5.0) System.out.println("Your income tax is 5%.");
        else if (inc>=5.0 && inc<10.0) System.out.println("Your income tax is 20%");
        else if (inc>=10.0) System.out.println("Your income tax is 30%");
        else System.out.println("You do not have to pay income tax.");
    }
}
