// SonarQube disse para trocar System.out.println por um logger.
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String input = "example";

        // Step 1: Convert string to character array
        char[] charArray = input.toCharArray();

        // Step 2: Sort the character array
        Arrays.sort(charArray);

        // Step 3: Convert back to string
        String sortedString = new String(charArray);

        // Output the result
        System.out.println("Original: " + input);
        System.out.println("Sorted: "   + sortedString);
    }
}