package com.mouredev.weeklychallenge2022

/*
 * Reto #30
 * MARCO DE PALABRAS
 * Fecha publicación enunciado: 26/07/22
 * Fecha publicación resolución: 01/08/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que reciba un texto y muestre cada palabra en una línea, formando
 * un marco rectangular de asteriscos.
 * - ¿Qué te parece el reto? Se vería así:
 *   **********
 *   * ¿Qué   *
 *   * te     *
 *   * parece *
 *   * el     *
 *   * reto?  *
 *   **********
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

private const val BORDER_CHAR = "*"


fun main() {
    draw("¿Qué te parece el reto?")
    draw("Otra frase a dibujar")
}

fun draw(text: String) {
    val aux = text.split(" ")
    val maxWordSize = wordMaxSize(aux)
    val boxWidth = maxWordSize + 2
    var whiteSpaces: Int
    for (j in 0..boxWidth) {
        print(BORDER_CHAR)
    }
    println()

    for(word in aux){
        print(BORDER_CHAR)
        print(word)
        whiteSpaces = maxWordSize - word.length
        while(whiteSpaces != 0){
            print(" ")
            whiteSpaces--
        }
        println(BORDER_CHAR)
    }

    for (j in 0..boxWidth) {
        print(BORDER_CHAR)
    }
    println()
}

fun wordMaxSize(words: List<String>): Int {
    var maxSize = 0
    for (word in words) {
        if(word.length > maxSize){
            maxSize = word.length
        }
    }
    return maxSize
}

fun Suyo() {
    drawFrame("¿Qué te parece el reto?")
    drawFrame("¿Qué te     parece el reto?")
    drawFrame("¿Cuántos retos de código de la comunidad has resuelto?")
}

private fun drawFrame(text: String) {

    val words = text.split(" ")
    var maxLength = 0
    words.forEach { word ->
        if (word.length > maxLength) {
            maxLength = word.length
        }
    }

    println("*".repeat(maxLength + 4))

    words.forEach { word ->
        if (word.isNotEmpty()) {
            println("* $word${" ".repeat(maxLength - word.length)} *")
        }
    }

    println("*".repeat(maxLength + 4))
}
