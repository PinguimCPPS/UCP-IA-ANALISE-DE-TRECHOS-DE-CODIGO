// SonarQube não disse nada
public class Main {
    public static void main(String[] args) {
        String str = "hello world";
        StringBuilder sb = new StringBuilder();
            for (char c : str.toCharArray()) {
                if (c != 'l') sb.append(c); // Remove all 'l's
            }
        String result = sb.toString(); // → "heo word"
        System.out.println(result)
    }
}