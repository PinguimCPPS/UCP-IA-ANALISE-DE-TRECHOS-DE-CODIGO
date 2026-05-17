// SonarQube disse para trocar System.out.println por um logger.
public class Main {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        for (char ch : str.toCharArray()) {
            System.out.println(ch);
        }
    }
}