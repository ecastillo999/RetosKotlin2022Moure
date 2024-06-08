"""
* Reto #1
 * ¿ES UN ANAGRAMA?
 * Dificultad: MEDIA
 
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
"""

def anagrama(palabra1, palabra2):
    palabra1 = palabra1.upper()
    palabra2 = palabra2.upper()

    palabra1 = list(palabra1)
    palabra2 = list(palabra2)

    palabra1.sort()
    palabra2.sort()
    
    if palabra1 == palabra2:
        es_anagrama = True
    else:
        es_anagrama = False

    return es_anagrama

palabra1 = input("Ingrese la primer palabra: ")
palabra2 = input("Ingrese la segunda palabra: ")

es_anagrama = anagrama(palabra1, palabra2)

if es_anagrama:
    print("Las palabras son anagramas")
else:
    print("Las palabras no son anagramas")