#  Reto #2
#  LA SUCESIÓN DE FIBONACCI
#  Fecha publicación enunciado: 10/01/22
#  Fecha publicación resolución: 17/01/22
#  Dificultad: DIFÍCIL
#
#  Enunciado: Escribe un programa que imprima los 50 primeros números de la sucesión de Fibonacci empezando en 0.
#  La serie Fibonacci se compone por una sucesión de números en la que el siguiente siempre es la suma de los dos anteriores.
#  0, 1, 1, 2, 3, 5, 8, 13...
#
#  Información adicional:
#  - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda la acomunidad.
#  - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
#  - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
#  - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
#

suFibonacci = []

for i in range(50):
  # Si la lista tiene un largo menor que 2, inserta directamente el valor de i
  if len(suFibonacci) < 2:
    suFibonacci.append(i)
  
  # En caso de que la lista tenga 2 o más elementos, realiza la suma de los últimos 2 valores
  else:
    addValues = suFibonacci[-2] + suFibonacci[-1]
    suFibonacci.append(addValues)

  # Imprime el último valor de la lista
  print(suFibonacci[-1])