//SonarQube disse para trocar o System.out.println por um logger
public class Main {
    public static void main(String[] args) {
        String str = "Hello World";
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // Swap characters
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            // Move pointers
            left++;
            right--;
        }

        String reversedStr = new String(chars);
        System.out.println("Reversed String: " + reversedStr);
    }
}