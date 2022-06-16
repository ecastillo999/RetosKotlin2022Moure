package com.mouredev.weeklychallenge2022

/*
 * Reto #24
 * ITERATION MASTER
 * Fecha publicación enunciado: 13/06/22
 * Fecha publicación resolución: 20/06/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Quiero contar del 1 al 100 de uno en uno (imprimiendo cada uno). ¿De cuántas maneras eres capaz de hacerlo? Crea el código para cada una de ellas.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
fun main() {
    println("Repeat")
    repeatCount()
    println("For")
    forCount()
    println("While")
    whileCount()
    println("Do While")
    doCount()
    println("Foreach with sleep")
    foreachCount()
    println("Recursion")
    recursionCount(1)
}

private fun repeatCount() {
    repeat(100) {
        printEOL(it+1)
    }
}

private fun forCount() {
    for (i in 1..100) {
        printEOL(i)
    }
}

private fun whileCount() {
    var i = 1
    while (i <= 100) {
        printEOL(i)
        i++
    }
}

private fun doCount() {
    var i = 1
    do {
        printEOL(i)
        i++
    } while (i <= 100)
}

private fun foreachCount() {
    IntArray(100) { it + 1 }.forEach { i ->
        printEOL(i)
    }
}

private fun recursionCount(i: Int) {
    if (i <= 100) {
        printEOL(i)
        recursionCount(i+1)
    }
}

private fun printEOL(i: Int) {
    print("$i ")
    if (i % 10 == 0)
        println()
}