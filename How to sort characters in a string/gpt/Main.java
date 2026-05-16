//SonarQube disse para trocar System.out.println por Logger
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "dcba";

        // Convert string to char array
        char[] chars = str.toCharArray();

        // Sort the array
        Arrays.sort(chars);

        // Convert back to string
        String sorted = new String(chars);

        System.out.println(sorted);
    }
}