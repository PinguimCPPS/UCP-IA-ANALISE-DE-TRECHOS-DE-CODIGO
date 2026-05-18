// SonarQube disse para trocar System.out.println por um logger.
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create an original array
        int[] originalArray = {1, 2, 3, 4, 5};

        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(originalArray));

        // Create a new array with increased size
        int[] newArray = Arrays.copyOf(originalArray, 10);

        // Print the new array
        System.out.println("New Array: " + Arrays.toString(newArray));
    }
}