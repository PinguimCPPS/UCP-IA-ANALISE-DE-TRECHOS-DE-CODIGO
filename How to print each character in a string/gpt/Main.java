//SonarQube disse para trocar System.out.println por Logger
public class Main {
    public static void main(String[] args) {

        String text = "Hello";

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }
}