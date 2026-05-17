// O SonarQube aconcelhou que trocasse o System.out por Logger.

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntegerStreamToArray {

    /**
     * Converts a Stream&lt;Integer&gt; to a primitive {@code int[]} array.
     *
     * @param integerStream the source stream of {@code Integer}
     * @return an {@code int[]} containing the same values in encounter order
     */
    public static int[] toIntArray(Stream<Integer> integerStream) {
        // map each Integer to an int and collect into an array
        return integerStream
                .mapToInt(Integer::intValue)   // or .mapToInt(i -> i)
                .toArray();
    }

    // -----------------------------------------------------------------
    // Example usage
    // -----------------------------------------------------------------
    public static void main(String[] args) {
        // Example 1: from a List<Integer>
        List<Integer> list = List.of(4, 7, 1, 9);
        int[] arrFromList = toIntArray(list.stream());
        System.out.println(java.util.Arrays.toString(arrFromList)); // [4, 7, 1, 9]

        // Example 2: from an explicit Stream.of(...)
        int[] arrFromStream = toIntArray(Stream.of(10, 20, 30));
        System.out.println(java.util.Arrays.toString(arrFromStream)); // [10, 20, 30]

        // Example 3: from an IntStream (already primitive) – just collect
        IntStream primitive = IntStream.of(5, 6, 7);
        int[] arrFromIntStream = primitive.toArray(); // no conversion needed
        System.out.println(java.util.Arrays.toString(arrFromIntStream)); // [5, 6, 7]
    }
}
