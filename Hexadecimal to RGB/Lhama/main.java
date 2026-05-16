//O SonarQube não falou nada sobre este codigo.

def hex_to_rgb(hex_color):
    hex_color = hex_color.lstrip('#')
    return tuple(int(hex_color[i:i+2], 16) for i in (0, 2, 4))

def rgb_to_hex(rgb_color):
    return '#{:02x}{:02x}{:02x}'.format(rgb_color[0], rgb_color[1], rgb_color[2])

# Exemplo de uso:
hex_color = '#ffffff'
rgb_color = hex_to_rgb(hex_color)
print(f'Hexadecimal {hex_color} é igual a RGB {rgb_color}')

rgb_color = (255, 0, 0)
hex_color = rgb_to_hex(rgb_color)
print(f'RGB {rgb_color} é igual a Hexadecimal {hex_color}')
