package learning.School.Class_1;
import java.util.Scanner;

public class P_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int roll;
        int sec;
        String branch;
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll No: ");
        roll = sc.nextInt();
        System.out.print("Enter Section: ");
        sec = sc.nextInt();
        System.out.print("Enter Branch: ");
        branch = sc.next();

        System.out.printf("\nName: %s\n", name);
        System.out.printf("Roll No: %d\n", roll);
        System.out.printf("Section: %s-%d\n",branch, sec);
        System.out.printf("Branch: %s", branch);
    }
}
