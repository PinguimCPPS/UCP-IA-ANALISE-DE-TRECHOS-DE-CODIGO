//SonarQube disse para mudar o System.out.println por um logger
import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        String jsonString = "{\"name\":\"John\", \"age\":30}";

        try (JsonReader reader = Json.createReader(new StringReader(jsonString))) {
            JsonObject jsonObject = reader.readObject();
            System.out.println("Name: " + jsonObject.getString("name"));
            System.out.println("Age: " + jsonObject.getInt("age"));
        }
    }
}