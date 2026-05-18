// SonarQube disse para trocar System.out.println por Logger.
public class Main {
    public static String reverseUsingStringBuilder(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String original = "hello";
        String reversed = reverseUsingStringBuilder(original);
        System.out.println(reversed);  // Output: "olleh"
    }
}