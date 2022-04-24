package com.mouredev.weeklychallenge2022

/*
 * Reto #16
 * EN MAYÚSCULA
 * Fecha publicación enunciado: 18/04/22
 * Fecha publicación resolución: 25/04/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que reciba un String de cualquier tipo y se encargue de
 * poner en mayúscula la primera letra de cada palabra.
 * - No se pueden utilizar operaciones del lenguaje que lo resuelvan directamente.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

fun main() {
    println(capitalizeWords(""))
    println(capitalizeWords("palabra"))
    println(capitalizeWords("varias palabras"))
    println(capitalizeWords("varias palabras, con puntuación."))
    println(capitalizeWords("varias palabras, con puntuación y MAYÚSCULAS."))
    println(capitalizeWords("varias palabras, con puntuación y MAYÚSCULAS\nen varias líneas."))
}

fun capitalizeWords(text: String): String {
    val wordSeparators = arrayOf(' ','\n')
    var result = ""
    text.forEachIndexed { index, c ->
        result += if(index == 0 || wordSeparators.contains(text[index-1])) c.uppercase() else c.lowercase()
    }
    return result
}