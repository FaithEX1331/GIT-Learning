package learning.School.Class_2;

import java.util.Scanner;

public class PC_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How old are you? ");
        int age = sc.nextInt();

        if (age>=18) System.out.println("You are eligible to vote.");
        else System.out.println("You are not eligible for vote.");

        sc.close();
    }
}
