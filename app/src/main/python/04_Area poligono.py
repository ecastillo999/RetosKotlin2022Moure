"""
 * Reto #4
 * ÁREA DE UN POLÍGONO
 * Dificultad: FÁCIL
 *
 * Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 """

def area(poligono):
    if poligono == 1: #Calculo area Triangulo
        base = float(input("Ingrese en cm la base del triángulo: "))
        altura = float(input("Ingrese en cm la altura del triángulo: "))
        area = base* altura
    elif poligono == 2: #Calculo area Cuadrado
        lado = float(input("Ingrese en cm un lado del cuadrado: "))
        area = lado * lado
    else: #Calculo area Rectangulo (ancho * alto)
        ancho = float(input("Ingrese en cm el lado del rectangulo: "))
        alto = float(input("Ingrese en cm el alto del rectangulo: "))
        area = ancho * alto
    return area

# Se pide la seleccion del poligono mediante un menu simple
print("Calculo del area de los poligono.\n1. Triangulo\n2. Cuadrado\n3. Rectangulo")
poligono = int(input("Seleccione el poligono que desea: "))

# Se evalua si se ingreso una opcion correcta, sino el programa se cierra
if poligono <= 3:
    area = area(poligono)

    # Se imprime el resultado segun la seleccion del menú
    if poligono == "1":
        print(f"El area del triángulo que ingreso es: {area}")
    elif poligono == "2":
        print(f"El area del cuadrado que ingreso es: {area}")
    else:
        print(f"El area del rectangulo que ingreso es: {area}")

else:
    print("La opción ingresada es incorrecta. Se cierra el programa")

