// O SonarQube respondeu :
// Ele faou ara Adicionar um construtor privado para ocultar o construtor público implícito.

public class HexToRGB { public static int[] hexToRgb(String hex) { if (!hex.startsWith("#")) { hex = "#" + hex; } hex = hex.toUpperCase(); String cleanHex = hex.substring(1);

    if (cleanHex.length() == 3) {
        cleanHex = cleanHex.charAt(0) + "" + 
                  cleanHex.charAt(0) + 
                  cleanHex.charAt(1) + "" + 
                  cleanHex.charAt(1) + 
                  cleanHex.charAt(2) + "" + 
                  cleanHex.charAt(2);
    }
    
    int r = Integer.parseInt(cleanHex.substring(0, 2), 16);
    int g = Integer.parseInt(cleanHex.substring(2, 4), 16);
    int b = Integer.parseInt(cleanHex.substring(4, 6), 16);
    
    return new int[]{r, g, b};
}

}
