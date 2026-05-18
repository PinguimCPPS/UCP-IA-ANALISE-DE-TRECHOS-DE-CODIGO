// SonarQube disse para trocar System.out.println por um logger.
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        
        // Increase size by 2 elements
        numbers = Arrays.copyOf(numbers, numbers.length + 2);
        
        // The new elements are initialized to 0 (default for int)
        System.out.println(Arrays.toString(numbers)); // Output: [1, 2, 3, 0, 0]
    }
}