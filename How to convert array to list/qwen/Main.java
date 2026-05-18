// SonarQube disse para trocar System.out.println por um logger.
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "cherry"};
        List<String> fixedList = Arrays.asList(array); // Fixed-size list
        System.out.println(fixedList); // [apple, banana, cherry]
    }
}