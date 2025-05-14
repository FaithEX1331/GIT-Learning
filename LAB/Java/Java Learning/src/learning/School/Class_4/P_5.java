package learning.School.Class_4;
import java.util.Scanner;

public class P_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the list of numbers
        System.out.print("Enter a list of numbers (space-separated): ");
        String input = scanner.nextLine();

        // Split the input string into individual number strings
        String[] numbersStr = input.split(" ");

        // Convert the string array to an integer array
        int[] numbers = new int[numbersStr.length];
        for (int i = 0; i < numbersStr.length; i++) {
            numbers[i] = Integer.parseInt(numbersStr[i]);
        }

        // Count occurrences of each number
        for (int i = 0; i < numbers.length; i++) {
            boolean alreadyCounted = false;

            // Check if the number has already been counted
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    alreadyCounted = true;
                    break;
                }
            }

            // If the number has not been counted yet, count its occurrences
            if (!alreadyCounted) {
                int count = 0;
                for (int j = 0; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        count++;
                    }
                }
                // Output the count for this number
                System.out.println("Occurrence of " + numbers[i] + " =" + count);
            }
        }
    }
}

