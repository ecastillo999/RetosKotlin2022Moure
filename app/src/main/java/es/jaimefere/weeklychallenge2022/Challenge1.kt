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


fun areAnagram(wordA: String, wordB: String): Boolean {
    return (wordA.lowercase().toCharArray().sortedArray().contentEquals(wordB.lowercase().toCharArray().sortedArray())) &&
            (wordA.filterIndexed { index, c -> wordB[index].lowercase() == c.lowercase() }.isEmpty())   // para reordenar TODAS las letras
}

fun main() {
    println(areAnagram("Roma",""))
    println(areAnagram("Roma","Roma"))
    println(areAnagram("Roma","Peru"))
    println(areAnagram("Roma","romana"))
    println(areAnagram("Roma","ramo"))
    println(areAnagram("Roma","mora"))
    println(areAnagram("Roma","Moar"))
    println(areAnagram("Roma","amor"))
}
