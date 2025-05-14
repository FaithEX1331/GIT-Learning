package learning.School.Class_2;
import java.util.Scanner;

public class PC_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int secNum = 13;
        int i = 0;
        int uNum;

        do {
            System.out.print("Enter your number: ");
            uNum = sc.nextInt();

            if (uNum>secNum) {
                System.out.println("You have entered a larger num. Try again!");
                i++;

            }
            else if (uNum<secNum) {
                System.out.println("You have entered a smaller num. Try again!");
                i++;
            }
        }while(uNum != secNum);

        System.out.println("Congratulations! You guessed the correct number.");
        System.out.printf("It took you %d tries to get the correct number.\n", i);
    }
}
