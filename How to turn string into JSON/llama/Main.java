//SonarQube disse para mudar o System.out.println por um logger
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        String jsonString = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}";
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            System.out.println(jsonObject.toString(4)); // Pretty-print the JSON
        } catch (Exception e) {
            System.out.println("Error parsing JSON: " + e.getMessage());
        }
    }
}