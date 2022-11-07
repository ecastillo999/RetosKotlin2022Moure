package com.mouredev.weeklychallenge2022

import java.util.*

/*
 * Reto #44
 * BUMERANES
 * Fecha publicación enunciado: 02/10/22
 * Fecha publicación resolución: 07/11/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que retorne el número total de bumeranes de un array de números
 * enteros e imprima cada uno de ellos.
 * - Un bumerán (búmeran, boomerang) es una secuencia formada por 3 números seguidos, en el que el
 *   primero y el último son iguales, y el segundo es diferente. Por ejemplo [2, 1, 2].
 * - En el array [2, 1, 2, 3, 3, 4, 2, 4] hay 2 bumeranes ([2, 1, 2] y [4, 2, 4]).
 *
 * Información adicional:
 * - Usa el canal de nuestro Discord (https://mouredev.com/discord) "🔁reto-semanal"
 *   para preguntas, dudas o prestar ayuda a la comunidad.
 * - Tienes toda la información sobre los retos semanales en
 *   https://retosdeprogramacion.com/semanales2022.
 *
 */

fun main(){


    println(boomerangs(arrayOf(2,1,2,4,2,4)).contentToString())
    println(boomerangs(arrayOf(2, 1, 2, 3, 3, 4, 2, 4)).contentDeepToString())
    println(boomerangs(arrayOf('a', 'b', 'a', 'c', 'c', 'd', 'a', 'd', 'b', 'd')).contentDeepToString())

}

/**
 * Funcion que retorna el numero de bumeranes de un array de elementos T
 * @param array Array de elementos T
 * @return Array de bumeranes encontrados
 */

inline fun <reified T>boomerangs(numbers: Array<T>) : Array<String> {
    var boomerangs = arrayOf<String>()
    for (i in 0 until numbers.size - 2) {
            if (numbers[i] == numbers[i + 2]) {
                val boomerang = arrayOf(numbers[i], numbers[i + 1], numbers[i + 2])
                boomerangs+= "{${boomerang.joinToString().trim()}}".trim()

            }
        }

    return boomerangs



}