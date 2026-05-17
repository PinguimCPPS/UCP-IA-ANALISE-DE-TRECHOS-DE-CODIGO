// O SonarQube aconcelhou que trocasse o System.out por Logger.

public class Main {
    public static void main(String[] args) {
        System.out.println("\u001B[31m" + "Vermelho" + "\u001B[0m");
        System.out.println("\u001B[32m" + "Verde" + "\u001B[0m");
        System.out.println("\u001B[33m" + "Amarelo" + "\u001B[0m");
        System.out.println("\u001B[34m" + "Azul" + "\u001B[0m");
        System.out.println("\u001B[35m" + "Magenta" + "\u001B[0m");
        System.out.println("\u001B[36m" + "Ciano" + "\u001B[0m");
        System.out.println("\u001B[37m" + "Branco" + "\u001B[0m");
    }
}
