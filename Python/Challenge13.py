# 
#  Reto #13
#  FACTORIAL RECURSIVO
#  Fecha publicación enunciado: 28/03/22
#  Fecha publicación resolución: 04/04/22
#  Dificultad: FÁCIL
#  
#  Enunciado: Escribe una función que calcule y retorne el factorial de un número dado de forma recursiva.
#  
#  Información adicional:
#  - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar 
#      ayuda a la comunidad.
#  - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
#  - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
#  - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
#  
#  


def recursive_factorial(num: int):
    if num == 1 or num == 0:
        return 1
    else:
        return num * recursive_factorial(num - 1)


# Tests
print(recursive_factorial(7))
print(recursive_factorial(5))
print(recursive_factorial(0))
print(recursive_factorial(10))

# Result Tests
# 7 -> 5040
# 5 -> 120
# 0 -> 1
# 10 -> 3628800
