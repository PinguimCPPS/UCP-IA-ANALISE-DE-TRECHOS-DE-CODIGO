// SonarQube disse para trocar System.out.println por um logger.
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1};
        Arrays.sort(arr);  // Sorts the array in ascending order
        System.out.println(Arrays.toString(arr));  // Output: [1, 3, 5, 8]
    }
}