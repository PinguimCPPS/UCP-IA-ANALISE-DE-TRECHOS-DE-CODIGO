//SonarQube disse para trocar System.out.println por Logger.
public class Main {
    public static void main(String[] args) {
        String text = "Hello";

        String reversed = new StringBuilder(text)
                                .reverse()
                                .toString();

        System.out.println(reversed);
    }
}