package learning.School.Class_1;
import java.util.Scanner;


public class P_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String fName = sc.next();
        System.out.print("Enter your last name: ");
        String lName = sc.next();

        System.out.printf("%s %s", lName, fName);

    }
}
