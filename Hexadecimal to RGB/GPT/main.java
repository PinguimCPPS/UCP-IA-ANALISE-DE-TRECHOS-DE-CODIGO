// O SonarQube disse para:
// Trocar o System.out por Logger.

public class HexToRgbConverter {

    /**
     * Converte uma cor no formato hexadecimal (ex.: "#1A2B3C" ou "1A2B3C") para um array contendo
     * os valores RGB.
     *
     * @param hex cor hexadecimal
     * @return int[3] contendo {red, green, blue}
     * @throws IllegalArgumentException se o formato for inválido
     */
    public static int[] hexToRgb(String hex) {
        if (hex == null) {
            throw new IllegalArgumentException("String de cor não pode ser nula.");
        }

        // Remove o caractere '#' caso exista
        hex = hex.trim();
        if (hex.startsWith("#")) {
            hex = hex.substring(1);
        }

        // Aceita formatos de 3 ou 6 dígitos
        if (hex.length() == 3) {
            // Expande "abc" → "aabbcc"
            char r = hex.charAt(0);
            char g = hex.charAt(1);
            char b = hex.charAt(2);
            hex = "" + r + r + g + g + b + b;
        } else if (hex.length() != 6) {
            throw new IllegalArgumentException("Formato hexadecimal inválido. Use #RRGGBB ou #RGB.");
        }

        try {
            int red = Integer.parseInt(hex.substring(0, 2), 16);
            int green = Integer.parseInt(hex.substring(2, 4), 16);
            int blue = Integer.parseInt(hex.substring(4, 6), 16);
            return new int[]{red, green, blue};
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Caractere não hexadecimal encontrado.", e);
        }
    }

    // Exemplo de uso
    public static void main(String[] args) {
        String[] examples = {"#1A2B3C", "FF5733", "abc", "#FFF"};
        for (String hex : examples) {
            int[] rgb = hexToRgb(hex);
            System.out.printf("Hex %s -> RGB(%d, %d, %d)%n", hex, rgb[0], rgb[1], rgb[2]);
        }
    }
}
