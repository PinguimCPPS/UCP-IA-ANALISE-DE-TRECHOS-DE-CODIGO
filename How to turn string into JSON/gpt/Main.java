//Trocar system.out.println por um logger
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws Exception {

        String jsonString = "{\"name\":\"Miguel\",\"age\":20}";

        ObjectMapper mapper = new ObjectMapper();

        JsonNode json = mapper.readTree(jsonString);

        System.out.println(json.get("name").asText());
        System.out.println(json.get("age").asInt());
    }
}