// O SonarQube aconcelhou que trocasse o System.out por Logger.

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
        int[] intArray = intStream.toArray();
        for (int i : intArray) {
            System.out.println(i);
        }
    }
}
