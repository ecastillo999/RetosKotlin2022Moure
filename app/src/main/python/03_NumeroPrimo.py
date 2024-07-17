# Escribe un programa que se encargue de comprobar si un número es o no primo.
# Hecho esto, imprime los números primos entre 1 y 100.

def es_primo(number):
    if number == 2:
        return True
    else:
        for x in range(2, number):
            if number % x != 0:
                x += 1
            else:
                return False
        return True


for x in range(2, 101):
    if es_primo(x):
        print(x)
