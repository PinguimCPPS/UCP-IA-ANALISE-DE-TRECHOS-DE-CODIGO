// SonarQube disse para trocar System.out.println por um logger.
public class Main {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String newStr = str.replace("l", "");
        System.out.println(newStr); // Output: "Heo, Word!"
    }
}