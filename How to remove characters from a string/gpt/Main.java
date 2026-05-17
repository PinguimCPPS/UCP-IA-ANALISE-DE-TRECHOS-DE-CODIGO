//SonarQube disse para trocar System.out.println por Logger
public class Main {
    public static void main(String[] args) {

        String text = "banana";

        String result = text.replace("a", "");

        System.out.println(result);
    }
}