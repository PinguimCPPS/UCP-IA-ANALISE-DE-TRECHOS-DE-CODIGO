// SonarQube disse para trocar System.out.println por um logger.
public class Main {
    public static void main(String[] args) {
        String str = "dcba";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sortedStr = new String(chars);
        System.out.println(sortedStr); // Output: abcd
    }
}