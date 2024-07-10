# * Escribe una función que reciba dos palabras (String) y retorne
# * verdadero o falso (Bool) según sean o no anagramas.
# * - Un Anagrama consiste en formar una palabra reordenando TODAS
# *   las letras de otra palabra inicial.
# * - NO hace falta comprobar que ambas palabras existan.
# * - Dos palabras exactamente iguales no son anagrama.

def es_anagrama(word1: str, word2: str) -> bool:
    if word1 == word2:
        return False
    elif len(word1) != len(word2):
        return False
    else:
        return sorted(word1) == sorted(word2)


first_word = input("Introduzca la primera palabra: ").lower()
second_word = input("Introduzca la segunda palabra: ").lower()

if es_anagrama(first_word, second_word):
    print("Las palabras elegidas son anagrama")
else:
    print("Las palabras elegidas NO son anagrama")
