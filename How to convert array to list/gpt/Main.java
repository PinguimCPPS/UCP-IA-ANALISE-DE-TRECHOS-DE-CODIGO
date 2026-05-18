//SonarQube disse para trocar System.out.println por Logger
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Orange"};

        List<String> fruitList = Arrays.asList(fruits);

        System.out.println(fruitList);
    }
}