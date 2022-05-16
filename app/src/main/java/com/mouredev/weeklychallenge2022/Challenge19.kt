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


fun main() {
    val days = 1
    val hours= 2
    val minutes= 3
    val seconds= 59

    println("${days} dias , ${hours}  horas , ${minutes} minutos , ${minutes} , ${seconds} segundos  : milisegundos : ${date2milliseconds(days, hours ,minutes,seconds)}")
}


/**
 * Funcion que convierte una fecha en milisegundos
 * @param days dias de la fecha
 * @param hours horas de la fecha
 * @param minutes minutos de la fecha
 * @param seconds segundos de la fecha
 * @return Long con los milisegundos de la fecha
 */
fun date2milliseconds(days: Int, hours: Int, minutes: Int, seconds: Int): Long {
    return (days * 24 * 60 * 60 * 1000) + (hours * 60 * 60 * 1000) + (minutes * 60 * 1000) + (seconds * 1000).toLong()
}
