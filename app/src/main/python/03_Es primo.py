"""
/*
 * Reto #3
 * ¿ES UN NÚMERO PRIMO?
 * Dificultad: MEDIA
 *
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
"""

def es_primo(num):
    for n in range(2, num):
        if num % n == 0:
            return False
    
    return True
    
num = int(input("Ingrese un número: "))

if es_primo(num):
   print("El numero es primo")
else:
    print("El numero no es primo")

i=1   
while i<=100:
    if es_primo(i):
        print(i)
    i += 1