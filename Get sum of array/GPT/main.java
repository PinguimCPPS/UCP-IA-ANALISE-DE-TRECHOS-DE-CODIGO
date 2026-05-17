// O SonarQube aconcelhou que trocasse o System.out por Logger.

public class ArraySum {

    /**
     * Returns the sum of all elements in the given int array.
     *
     * @param numbers the array to sum
     * @return the total sum
     */
    public static int sum(int[] numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    // Example usage
    public static void main(String[] args) {
        int[] data = {4, 7, 1, 9, 3};
        int result = sum(data);
        System.out.println("Sum of the array = " + result); // Output: 24
    }
}
