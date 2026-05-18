// SonarQube disse para trocar System.out.println por um logger.
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Define an array
        String[] array = {"apple", "banana", "cherry"};

        // Convert array to list
        List<String> list = Arrays.asList(array);

        // Print the list
        System.out.println(list);
    }
}