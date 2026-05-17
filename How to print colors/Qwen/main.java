// O SonarQube aconcelhou que trocasse o System.out por Logger.
// Tambem disse para Utilizar acesso estático com "javax.swing.WindowConstants" para "EXIT_ON_CLOSE".

public class ColorPrinter {
    
    // ANSI escape codes for console colors
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        // Console color printing
        System.out.println(ANSI_RED + "This is red text" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "This is green text" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "This is blue text" + ANSI_RESET);

        // Example with background colors
        System.out.println(ANSI_YELLOW + ANSI_BLACK_BACKGROUND + "Yellow text on black background" + ANSI_RESET);

        // GUI color example using Swing
        javax.swing.SwingUtilities.invokeLater(() -> {
            javax.swing.JFrame frame = new javax.swing.JFrame("Color Example");
            frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);
            
            javax.swing.JLabel label = new javax.swing.JLabel("Colored Text");
            label.setForeground(java.awt.Color.RED); // Text color
            label.setBackground(java.awt.Color.YELLOW); // Background color
            label.setOpaque(true);
            
            frame.add(label);
            frame.setVisible(true);
        });
    }
}
