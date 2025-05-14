package learning.School.Class_4;

import java.util.Scanner;

public class P_1 {
    public static void findPrimesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper limit range: ");
        int n = sc.nextInt(); // Input: Upper limit of the range
        System.out.print("Prime numbers up to " + n + ": ");
        findPrimesInRange(n);
    }
}
