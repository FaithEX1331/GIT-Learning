public class Test {

    public interface MathOperations {
        int add(int a, int b) throws NegativeNumberException;
    }

    public interface Display {
        void showResult(int result);
    }

    public static class NegativeNumberException extends Exception {
        public NegativeNumberException(String message) {
            super(message);
        }
    }

    public static class Calculator implements MathOperations, Display {
        public int add(int a, int b) throws NegativeNumberException {
            if (a < 0 || b < 0) {
                throw new NegativeNumberException("Negative numbers are not allowed");
            }
            return a + b;
        }

        public void showResult(int result) {
            System.out.println("Result: " + result);
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try {
            int result = calculator.add(5, 3);
            calculator.showResult(result);

            // This will throw an exception
            result = calculator.add(10, -2);
            calculator.showResult(result);
        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}