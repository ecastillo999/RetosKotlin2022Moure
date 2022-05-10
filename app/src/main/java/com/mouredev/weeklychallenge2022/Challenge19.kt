package com.mouredev.weeklychallenge2022

/*
 * Reto #19
 * CONVERSOR TIEMPO
 * Fecha publicación enunciado: 09/05/22
 * Fecha publicación resolución: 16/05/22
 * Dificultad: FACIL
 *
 * Enunciado: Crea una función que reciba días, horas, minutos y segundos (como enteros) y retorne su resultado en milisegundos.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

infix fun <P1, R, P2> ((P1) -> R).compose(f: (P2) -> P1): (P2) -> R = { p1: P2 -> this(f(p1)) }

val secondsToMilliseconds: (Long) -> Long = { it * 1000L }
val minutesToSeconds: (Long) -> Long = { it * 60L }
val hoursToMinutes: (Long) -> Long = minutesToSeconds
val daysToHours: (Long) -> Long = { it * 24L }

val minutesToMilliseconds =
    (secondsToMilliseconds compose minutesToSeconds)

val hoursToMilliseconds =
    (minutesToMilliseconds compose hoursToMinutes)

val daysToMilliseconds =
    (hoursToMilliseconds compose daysToHours)

fun timeToMilliseconds(days: Int, hours: Int, minutes: Int, seconds: Int): Long =
    daysToMilliseconds(days.toLong()) +
            hoursToMilliseconds(hours.toLong()) +
            minutesToMilliseconds(minutes.toLong()) +
            secondsToMilliseconds(seconds.toLong())

fun main() {
    println(timeToMilliseconds(345, 237, 2387, 8273))
}
