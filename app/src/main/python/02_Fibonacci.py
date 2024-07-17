# Escribe un programa que imprima los 50 primeros números de la sucesión
# de Fibonacci empezando en 0.
# La serie Fibonacci se compone por una sucesión de números en
# la que el siguiente siempre es la suma de los dos anteriores.
# 0, 1, 1, 2, 3, 5, 8, 13...

fibonacci = []

for number in range(50):
    fibonacci.append(number)
    if len(fibonacci) > 2:
        fibonacci[number] = fibonacci[number - 1] + fibonacci[number - 2]

print(f"Fibonacci: {fibonacci}")
