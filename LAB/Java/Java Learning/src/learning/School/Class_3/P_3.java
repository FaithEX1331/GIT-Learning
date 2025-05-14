package learning.School.Class_3;
public class P_3 {
    public static void main(String[] args) {
        int n = 10; // Input: Nth Fibonacci number to find
        System.out.println("The " + n + "th Fibonacci number is: " + findFibonacci(n));
    }

    public static int findFibonacci(int n) {
        if (n <= 0) {
            return 0; // Base case: F(0) = 0
        }
        if (n == 1) {
            return 1; // Base case: F(1) = 1
        }

        int a = 0, b = 1;
        int fib = 0;

        for (int i = 2; i <= n; i++) {
            fib = a + b; // Current Fibonacci number
            a = b;       // Shift variables for next iteration
            b = fib;
        }

        return fib;
    }

}
