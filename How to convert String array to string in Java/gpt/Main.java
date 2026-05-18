//SonarQube disse para trocar System.out.println por Logger
public class Main {
    public static void main(String[] args) {
        String[] words = {"Hello", "World", "Java"};

        String result = String.join(" ", words);

        System.out.println(result);
    }
}