package com.mouredev.weeklychallenge2022

/*
 * Reto #27
 * VECTORES ORTOGONALES
 * Fecha publicación enunciado: 07/07/22
 * Fecha publicación resolución: 11/07/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa que determine si dos vectores son ortogonales.
 * - Los dos array deben tener la misma longitud.
 * - Cada vector se podría representar como un array. Ejemplo: [1, -2]
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

fun main() {
<<<<<<< HEAD
    println(sonVectoresOrtogonales(intArrayOf(1, -3), intArrayOf(-2, 4)))

    println(sonVectoresOrtogonales(intArrayOf(2, -2), intArrayOf(2, 2)))

    println(sonVectoresOrtogonales(intArrayOf(2, 4, 5), intArrayOf(-2, 3, 7)))

    println(sonVectoresOrtogonales(intArrayOf(1, 2, 4), intArrayOf(-2, 1)))
}

fun sonVectoresOrtogonales(vectorA: IntArray, vectorB: IntArray): String {
    var productoEscalar = 0
    var index = 0

    while (index < vectorA.size && index < vectorB.size) {
        productoEscalar += vectorA[index] * vectorB[index]
        index++
    }

    val vectoresAString = vectorA.contentToString() + vectorB.contentToString()

    return if (productoEscalar == 0)
        "Los Vectores: $vectoresAString son ortogonales"
    else "Los Vectores: $vectoresAString no son ortogonales"
=======
    println(areOrthogonal(Pair(1, 2), Pair(2, 1)))
    println(areOrthogonal(Pair(2, 1), Pair(-1, 2)))
}

private fun areOrthogonal(vectorOne: Pair<Int, Int>, vectorTwo: Pair<Int, Int>): Boolean {
    return vectorOne.first * vectorTwo.first + vectorOne.second * vectorTwo.second == 0
>>>>>>> upstream/main
}