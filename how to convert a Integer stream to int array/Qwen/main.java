// O SonarQube aconcelhou que trocasse o System.out por Logger.

import java.util.stream.Stream;

public class StreamToIntArray {
    public static void main(String[] args) {
        // Create a Stream of Integer objects
        Stream<Integer> integerStream = Stream.of(10, 20, 30, 40, 50);

        // Convert to int array
        int[] intArray = integerStream.mapToInt(Integer::intValue).toArray();

        // Print the resulting int array
        for (int num : intArray) {
            System.out.println(num);
        }
    }
}
