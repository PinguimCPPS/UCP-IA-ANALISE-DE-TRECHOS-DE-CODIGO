// O SonarQube Aconcelhou a trocar todos os System.out por Logger.

public class Main {
    public static void main(String[] args) {
        // Using println() to print with a newline
        System.out.println("Hello, World!");
        
        // Using print() to print without a newline
        System.out.print("This is ");
        System.out.print("a single line");
        
        // Printing a string variable
        String message = "Java is fun!";
        System.out.println("\n" + message);
    }
}
