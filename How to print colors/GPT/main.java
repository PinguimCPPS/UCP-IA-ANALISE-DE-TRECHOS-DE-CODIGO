// O SonarQube aconcelhou que trocasse o System.out por Logger.

public class ColorPrinter {

    /** ANSI escape codes for foreground colors */
    public static final String RESET  = "\u001B[0m";
    public static final String BLACK  = "\u001B[30m";
    public static final String RED    = "\u001B[31m";
    public static final String GREEN  = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE   = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN   = "\u001B[36m";
    public static final String WHITE  = "\u001B[37m";

    /** ANSI escape codes for background colors (optional) */
    public static final String BG_BLACK  = "\u001B[40m";
    public static final String BG_RED    = "\u001B[41m";
    public static final String BG_GREEN  = "\u001B[42m";
    public static final String BG_YELLOW = "\u001B[43m";
    public static final String BG_BLUE   = "\u001B[44m";
    public static final String BG_PURPLE = "\u001B[45m";
    public static final String BG_CYAN   = "\u001B[46m";
    public static final String BG_WHITE  = "\u001B[47m";

    /**
     * Prints the given text in the specified foreground color.
     *
     * @param color ANSI color code (e.g., RED, GREEN, BLUE, …)
     * @param text  Text to be printed
     */
    public static void print(String color, String text) {
        System.out.println(color + text + RESET);
    }

    /**
     * Prints the given text with both foreground and background colors.
     *
     * @param fgColor ANSI foreground color code
     * @param bgColor ANSI background color code
     * @param text    Text to be printed
     */
    public static void print(String fgColor, String bgColor, String text) {
        System.out.println(fgColor + bgColor + text + RESET);
    }

    public static void main(String[] args) {
        // Simple foreground examples
        print(RED,    "This is red");
        print(GREEN,  "This is green");
        print(YELLOW, "This is yellow");
        print(BLUE,   "This is blue");
        print(PURPLE, "This is purple");
        print(CYAN,   "This is cyan");
        print(WHITE,  "This is white (might appear as default colour)");

        // Foreground + background examples
        print(WHITE, BG_RED,    "White on red background");
        print(YELLOW, BG_BLUE,  "Yellow on blue background");
        print(BLACK, BG_GREEN,  "Black on green background");
    }
}
