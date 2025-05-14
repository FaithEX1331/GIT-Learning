package learning.EX;
import java.util.Scanner;

public class EX_22 {
    static int fib(int n)
    {
        // Base Case
        if (n <= 1)
            return n;

        // Recursive call
        return fib(n - 1) + fib(n - 2);
    }

    // Driver Code
    public static void main(String [] args)
    {
        // Given Number N
        int N = 4;

        // Print the first N numbers
        for (int i = 0; i < N; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
