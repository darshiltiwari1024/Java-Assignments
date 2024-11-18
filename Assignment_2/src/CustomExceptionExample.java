// Custom exception class
class CalculationException extends Exception {
    public CalculationException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {

    // Method to calculate an equation
    public static double calculateEquation(double a, double b, double c) throws CalculationException {
        try {
            // Example equation: (a / b) + sqrt(c)
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }

            double result = (a / b) + Math.sqrt(c);

            // Check for invalid square root operation
            if (c < 0) {
                throw new IllegalArgumentException("Cannot calculate the square root of a negative number.");
            }

            return result;
        } catch (ArithmeticException | IllegalArgumentException e) {
            throw new CalculationException("Calculation error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Example values
        double a = 10, b = 0, c = -25;

        try {
            double result = calculateEquation(a, b, c);
            System.out.println("Result: " + result);
        } catch (CalculationException e) {
            System.err.println("Custom Exception caught: " + e.getMessage());
        }
    }
}