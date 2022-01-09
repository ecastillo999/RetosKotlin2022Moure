package com.mouredev.weeklychallenge2022

/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Fecha publicación enunciado: 03/01/22
 * Fecha publicación resolución: 10/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🗓reto-semanal" para preguntas, dudas o prestar ayuda la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

fun main() {
    var firstWord: String
    var secondWord: String
    var result: Boolean = false

    print("Introduce la primera palabra: ")
    firstWord = readLine().toString()
    print("Introduce la segunda palabra: ")
    secondWord = readLine().toString()

    print("Es la segunda palabra anagrama de la primera? " + isAnagram(firstWord, secondWord))
}

fun isAnagram(word1: String, word2: String): Boolean{

    // Si las dos palabras son iguales  --> No es anagrama

    if (word1 == word2){
        return false
    }
    else{
        // Si las palabras tienen distinta longitud --> No es anagrama
        if (word1.length != word2.length){
            return false
        }
        else {
                // Vamos a comprobar si es anagrama
            var arrayWord1 : CharArray = word1.uppercase().toCharArray()
            var arrayWord2 : CharArray = word2.uppercase().toCharArray()

            arrayWord1.sort()
            arrayWord2.sort()

            return arrayWord1 contentEquals arrayWord2
        }
    }
}