package com.mouredev.weeklychallenge2022

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

def calcularArea(poligono):
    poli, b, h= poligono[0], poligono[1], poligono[2]
    if poli == "t":
        return (b*h)/2
    elif poli == "r":
        return b*h 
    elif poli == "c":
        return b**2

# Inicializacion de variables
base = 0
altura = 0
poli = ''

# Comprobar si introduccion de los datos del usuario
while poli != 't' and poli != 'r' and poli != 'c':
    poli = input("introduce poligono: [triangulo:t, rectangulo:r, cuadrado:c]: ")

while base <= 0:
    try:
        base = int(input("Introduce la base (>0): "))
    except ValueError:
        print("Debes introducir un numero mayor que 0")

# Si el poligono es cuadrado 'c' no se pide la altura
if poli != "c":
    while altura <= 0:
        try:
            altura = int(input("Introduce la altura (>0): "))
        except ValueError:
            print("Debes introducir un numero mayor que 0")

poligono = [poli, base, altura]
area = calcularArea(poligono)
print(f"El area del poligono seleccionado es: {area}")

