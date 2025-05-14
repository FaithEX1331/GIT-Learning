package learning.School.Class_1;
import java.util.Scanner;

public class PC_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String Name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your height: ");
        double height = sc.nextDouble();

        System.out.print("Enter your bg: ");
        String bg = sc.nextLine();


        System.out.printf("Name: %s",Name);
        System.out.printf("Age: %s",age);
        System.out.printf("Height: %s",height);
        System.out.println("bg : " + bg);

        sc.close();

    }
}
