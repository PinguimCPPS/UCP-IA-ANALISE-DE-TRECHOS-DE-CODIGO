// O SonarQube sugeriu:
// falou que O arquivo quary1.java não faz parte do projeto; apenas erros de sintaxe são relatados.
// falou para Mover os designadores de matriz [] para o tipo. em relação ao int RGB.
// E disse para trocar o "sistem.out" para um "logger".
public class HexToRgb {
    public static void main(String[] args) {
        String hex = "#FF0000";
        int rgb[] = hexToRgb(hex);
        System.out.println("RGB: (" + rgb[0] + ", " + rgb[1] + ", " + rgb[2] + ")");
    }

    public static int[] hexToRgb(String hex) {
        int[] rgb = new int[3];
        hex = hex.replace("#", "");
        rgb[0] = Integer.parseInt(hex.substring(0, 2), 16);
        rgb[1] = Integer.parseInt(hex.substring(2, 4), 16);
        rgb[2] = Integer.parseInt(hex.substring(4, 6), 16);
        return rgb;
    }

    
}
