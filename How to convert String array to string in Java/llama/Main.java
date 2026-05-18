// SonarQube disse para trocar System.out.println por um logger.
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] stringArray = {"Hello", "World", "from", "Java"};
        StringBuilder sb = new StringBuilder();
        
        for (String str : stringArray) {
            sb.append(str).append(" "); // Append each string followed by a space
        }
        
        Stringresult = sb.toString().trim(); // Remove trailing space
        System.out.println(result); // Output: "Hello World from Java"
    }
}