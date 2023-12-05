"""

/*
 * Reto #4
 * ÁREA DE UN POLÍGONO
 * Fecha publicación enunciado: 24/01/22
 * Fecha publicación resolución: 31/01/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
"""

class Triangulo():
    def calcularArea(base, altura):
        return (base*altura)/2

class Cuadrado():
    def calcularArea(lado):
        return (lado*lado)
    
class Rectangulo():
    def calcularArea(lado, altura):
        return (lado*altura)

def calcularPoligono(poligono):
    if poligono["Tipo"] == "Triángulo":
        return Triangulo.calcularArea(poligono["Base"], poligono["Altura"])
    elif poligono["Tipo"] == "Cuadrado":
        return Cuadrado.calcularArea(poligono["Lado"])
    elif poligono["Tipo"] == "Rectángulo":
        return Rectangulo.calcularArea(poligono["Lado"], poligono["Altura"])
    
triangulo = {
    "Tipo":"Triángulo",
    "Base": 2,
    "Altura": 4
}

cuadrado = {
    "Tipo":"Cuadrado",
    "Lado": 2,
}

rectangulo = {
    "Tipo":"Rectángulo",
    "Lado": 2,
    "Altura": 4
}


print(f"El area del poligono {triangulo['Tipo']} es {calcularPoligono(triangulo)}")
print(f"El area del poligono {triangulo['Tipo']} es {calcularPoligono(cuadrado)}")
print(f"El area del poligono {triangulo['Tipo']} es {calcularPoligono(rectangulo)}")