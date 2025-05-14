package learning.School.Class_3;

import java.util.Scanner;

public class P_1 {
    public static int findMissingNumber(int[] nums) {
        int n = nums.length + 1;
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;

        // Calculate the sum of the elements in the array
        for (int num : nums) {
            arraySum += num;
        }

        return totalSum - arraySum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int [] num = new int[size-1];
        System.out.printf("Enter %d elements:\n",size-1);
        for (int i = 0; i<(size-1);i++){
            num[i] = sc.nextInt();
        }

//        int[] nums = {1, 2, 4, 6, 3, 7}; // Example array
        int missingNumber = findMissingNumber(num);
        System.out.println("The missing number is: " + missingNumber);
    }
}
