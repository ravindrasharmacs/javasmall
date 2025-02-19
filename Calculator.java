
public class Calculator {

    @FunctionalInterface
    interface Operation {
        double perform(double a, double b);
    }

    // Define operations using lambda expressions
    private static final Operation ADD = (a, b) -> a + b;
    private static final Operation SUBTRACT = (a, b) -> a - b;
    private static final Operation MULTIPLY = (a, b) -> a * b;
    private static final Operation DIVIDE = (a, b) -> {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    };

    /**
     * Performs the specified arithmetic operation on two operands.
     * 
     * @param a The first operand
     * @param b The second operand
     * @param op The operation to perform
     * @return The result of the operation
     */
    public static double calculate(double a, double b, Operation op) {
        return op.perform(a, b);
    }

    public static void main(String[] args) {
        double a = 10;
        double b = 5;

        System.out.println("Addition: " + calculate(a, b, ADD));
        System.out.println("Subtraction: " + calculate(a, b, SUBTRACT));
        System.out.println("Multiplication: " + calculate(a, b, MULTIPLY));
        System.out.println("Division: " + calculate(a, b, DIVIDE));

        // Using method reference
        System.out.println("Addition (method reference): " + calculate(a, b, Double::sum));

        // Using lambda expression directly
        System.out.println("Power: " + calculate(a, b, (x, y) -> Math.pow(x, y)));
    }
}
