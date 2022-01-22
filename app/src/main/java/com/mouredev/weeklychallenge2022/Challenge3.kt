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
    primes(100)
    eratostenes()
}

private fun primes(num:Int) {
    println((1..num).filter{ x -> isPrime(x)})
}

private fun isPrime(num:Int) :Boolean {
    return (num > 1 && (2..(num / 2)).filter { i -> num % i == 0}.size == 0)
}

private fun eratostenes() {
    println((1..100).filter { x -> cribado(x) })
}

private fun cribado(num:Int) :Boolean {
    return (num > 1 && listOf(2, 3, 5, 7).filter { i -> num % i == 0 && num / i != 1}.size == 0)
}
