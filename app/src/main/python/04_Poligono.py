# Crea una única función (importante que sólo sea una) que sea capaz
# de calcular y retornar el área de un polígono.
# - La función recibirá por parámetro sólo UN polígono a la vez.
# - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
# - Imprime el cálculo del área de un polígono de cada tipo.
def calculate(polygon):

    if polygon == "triangle":
        base_param = float(input("Enter the base: "))
        height_param = float(input("Enter the height: "))
        return (base_param * height_param) // 2
    elif polygon == "rectangle":
        base_param = float(input("Enter the base: "))
        height_param = float(input("Enter the height: "))
        return base_param * height_param
    elif polygon == "square":
        side_param = float(input("Enter the side: "))
        return side_param * side_param


print("Triangle area")
triangle = calculate("triangle")
print(f"The triangle area is: {triangle}\n")

print("Square area")
square = calculate("square")
print(f"The square area is: {square}\n")

print("Rectangle area")
rectangle = calculate("rectangle")
print(f"The rectangle area is: {rectangle}")
