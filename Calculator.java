import java.lang.Math;

public class Calculator {
    public static double add(double operand1, double operand2) {
        return operand1 + operand2;
    }

    public static double subtract(double operand1, double operand2) {
        return operand1 - operand2;
    }

    public static double multiply(double operand1, double operand2) {
        return operand1 * operand2;
    }

    public static double divide(double operand1, double operand2) {
        // Check for division by zero
        if (operand2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return operand1 / operand2;
    }

    public static double sin(double angleInRadians) {
        return Math.sin(angleInRadians);
    }

    public static double cos(double angleInRadians) {
        return Math.cos(angleInRadians);
    }

    public static double tan(double angleInRadians) {
        return Math.tan(angleInRadians);
    }

    public static double log(double operand) {
        // Natural logarithm
        return Math.log(operand);
    }

    public static double log10(double operand) {
        // Base-10 logarithm
        return Math.log10(operand);
    }

    // Add more methods for additional scientific functions as needed
}
