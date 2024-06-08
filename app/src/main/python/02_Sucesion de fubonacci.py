"""
* Reto #2
 * LA SUCESIÓN DE FIBONACCI
 * Dificultad: DIFÍCIL

 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
"""

i = 0
ant = 0
num = 1

print(ant)
print(num)

while i <= 50:
    num = num + ant
    ant = num - ant
    print(num)
    i += 1