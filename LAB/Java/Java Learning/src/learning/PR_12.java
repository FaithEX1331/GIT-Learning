package learning;
import java.util.Scanner;

public class PR_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        int exp = sc.nextInt();
        if (exp>56){
            System.out.println("You are experienced.");
        } else if (exp>46 && ) {
            System.out.println("You are semi-experienced.");
        }
        else{
            System.out.println("You are not experienced enough.");
        }
        */

        int age = sc.nextInt();
        /*
        switch (age){
            case 18:
                System.out.println("You have become an adult.");
                break;
            case 25:
                System.out.println("You are old enough to get married. Get a job!");
                break;
            case 40:
                System.out.println("Your children are old enough to know what is good for them. Give them some freedom.");
                break;
            default:
                System.out.println("Enjoy your life!");
        }
        */
        switch (age) {
            case 18 -> System.out.println("You have become an adult.");
            case 25 -> System.out.println("You are old enough to get married. Get a job!");
            case 40 -> System.out.println("Your children are old enough to know what is good for them. Give them some freedom.");
            default -> System.out.println("Enjoy your life!");
        }

    }
}
