""" package com.mouredev.weeklychallenge2022

/*
 * Reto #6
 * INVIRTIENDO CADENAS
 * Fecha publicación enunciado: 07/02/22
 * Fecha publicación resolución: 14/02/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa que invierta el orden de una cadena de texto sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

fun main() {
    println(reverse("Hola mundo"))
    println(recursiveReverse("Hola mundo"))
}

private fun reverse(text: String): String {
    val textCount = text.count() - 1
    var reversedText = ""
    for (index in 0..textCount) {
        reversedText += text[textCount - index]
    }
    return reversedText
}

// Sin un bucle, mediante una función recursiva
private fun recursiveReverse(text: String, index: Int = 0, reversedText: String = ""): String {
    val textCount = text.count() - 1
    var newReversedText = reversedText
    newReversedText += text[textCount - index]
    if (index < textCount) {
        val newIndex = index + 1
        newReversedText = recursiveReverse(text, newIndex, newReversedText)
    }
    return newReversedText
}

 """

def invert_string(string):

    new_string = ""

    for i in range((len(string)-1), -1, -1):
        new_string += string[i]

    print(new_string)

invert_string("Hola mundo")

def upside_down_word(word: str):

    # Crea una nueva variable de tipo String
    new_word = ""

    # Para cada letra en el orden inverso de la palabra ingresada, se concatena en una nueva palabra
    # Obteniendo la frase o palabra ingresada de forma inversa
    for i in word[::-1]:
        new_word += i

    return new_word


# Run Code
phrase = "Hola Mundo"
new_phrase = upside_down_word(phrase)

print(f"The phrase '{phrase}', upside down is '{new_phrase}'.")