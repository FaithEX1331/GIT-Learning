package learning.School.Class_4;
import java.util.Scanner;

public class P_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the list
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Initialize the array
        int[] numbers = new int[n];

        // Get the numbers from the user
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Sort the array in ascending order
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        // Print the sorted array in ascending order
        System.out.println("Sorted in Ascending Order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Sort the array in descending order
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] < numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        // Print the sorted array in descending order
        System.out.println("Sorted in Descending Order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

