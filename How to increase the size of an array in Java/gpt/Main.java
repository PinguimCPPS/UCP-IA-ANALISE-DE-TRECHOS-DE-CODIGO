//SonarQube disse para trocar System.out.println por Logger
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        // Increase size to 5
        numbers = Arrays.copyOf(numbers, 5);

        numbers[3] = 4;
        numbers[4] = 5;

        System.out.println(Arrays.toString(numbers));
    }
}