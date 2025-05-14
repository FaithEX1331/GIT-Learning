package learning.School.Class_2;
import java.util.Scanner;

public class PC_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String Name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your height: ");
        double height = sc.nextDouble();

        System.out.printf("Name: %s",Name);
        System.out.printf("Age: %s",age);
        System.out.printf("Height: %s",height);

        sc.close();

    }
}
