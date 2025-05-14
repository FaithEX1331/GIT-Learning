package learning.EX;
import java.util.Scanner;
import java.util.Random;

public class EX_14 {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("Enter your choice: ");
        System.out.println("0 -> rock");
        System.out.println("1 -> paper");
        System.out.println("2 -> scissors");
        Scanner sc = new Scanner(System.in);
        int uChoice = sc.nextInt();
        int cChoice = rand.nextInt(0,3);

        if (uChoice == 0){
            System.out.println("You have chosen rock.");
            if (cChoice == 0) {
                System.out.println("The computer chose rock.");
                System.out.println("It is a draw.");
            }
            else if (cChoice == 1) {
                System.out.println("The computer chose paper.");
                System.out.println("You have lost.");
            }
            else {
                System.out.println("The computer chose scissor.");
                System.out.println("You have won");
            }
        }
        else if (uChoice == 1){
            System.out.println("You have chosen paper.");
            if (cChoice == 0) {
                System.out.println("The computer chose rock.");
                System.out.println("You have won");
            }
            else if (cChoice == 1) {
                System.out.println("The computer chose paper.");
                System.out.println("It is a draw.");
            }
            else {
                System.out.println("The computer chose scissor.");
                System.out.println("You have lost.");
            }
        }
        else{
            System.out.println("You have chosen scissor.");
            if (cChoice == 0) {
                System.out.println("The computer chose rock.");
                System.out.println("You have lost.");
            }
            else if (cChoice == 1) {
                System.out.println("The computer chose paper.");
                System.out.println("You have won");
            }
            else {
                System.out.println("The computer chose scissor.");
                System.out.println("It is a draw.");
            }
        }

    }
}
