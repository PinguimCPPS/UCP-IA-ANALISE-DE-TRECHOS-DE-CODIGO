//O SonarQube não encontrou problema algum com este código.

def hex_to_rgb(hex_color):
    """Convert a hex color string (e.g., '#ff00aa' or 'ff0') to an (R, G, B) tuple."""
    hex_color = hex_color.lstrip('#')
    if len(hex_color) not in (3, 6):
        raise ValueError("Hex color must be 3 or 6 characters long")
    if len(hex_color) == 3:
        hex_color = ''.join(c * 2 for c in hex_color)
    r = int(hex_color[0:2], 16)
    g = int(hex_color[2:4], 16)
    b = int(hex_color[4:6], 16)
    return (r, g, b)
