package learning.School.Class_1;
import java.util.Scanner;

public class P_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        float grade = sc.nextFloat();
        if(grade>=9.0) System.out.println("Your grade is O.");
        else if(grade>=8.0) System.out.println("Your grade is A.");
        else if(grade>=7.0) System.out.println("Your grade is B.");
        else if(grade>=6.0) System.out.println("Your grade is C.");
        else if(grade>=5.0) System.out.println("Your grade is D.");
        else if(grade>=4.0) System.out.println("Your grade is F.");
    }
}
