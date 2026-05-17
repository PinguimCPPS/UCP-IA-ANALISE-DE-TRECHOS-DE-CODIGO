// O SonarQube aconcelhou que trocasse o System.out por Logger.

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = getSum(array);
        System.out.println(sum);
    }

    public static int getSum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
}
