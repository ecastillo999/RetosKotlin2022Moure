package com.mouredev.weeklychallenge2022

/*
 * Reto #3
 * ¿ES UN NÚMERO PRIMO?
 * Fecha publicación enunciado: 17/01/22
 * Fecha publicación resolución: 24/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

fun main() {
    for (i in 1..100) {
        if (i == 1) {
            continue
        }
        var esPrimo = false
        for (j in 1..i) {
            if (i % j == 0) {
                if (j != 1 && j != i) {
                    break
                } else if (j == i) {
                    esPrimo = true
                }
            }
        }
        if (esPrimo) {
            println(i)
        }
    }
}
