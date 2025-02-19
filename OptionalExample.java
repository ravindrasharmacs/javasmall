import java.util.Optional;

public class OptionalExample {
    
    /**
     * Returns an Optional<String> based on the input string.
     * 
     * @param input The input string to be wrapped in an Optional
     * @return An Optional containing the input string if it's not null,
     *         or an empty Optional if the input is null
     */
    public static Optional<String> createOptionalString(String input) {
        return Optional.ofNullable(input);
    }

    public static void main(String[] args) {
        // Test the function with a non-null string
        String nonNullInput = "Hello, World!";
        Optional<String> nonNullResult = createOptionalString(nonNullInput);
        System.out.println("Non-null input result: " + nonNullResult);

        // Test the function with a null string
        String nullInput = null;
        Optional<String> nullResult = createOptionalString(nullInput);
        System.out.println("Null input result: " + nullResult);
    }
}

