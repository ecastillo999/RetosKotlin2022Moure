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
    TimeToMiliseconds(1,0,0,0)
    TimeToMiliseconds(0,1,0,0)
    TimeToMiliseconds(0,0,1,0)
    TimeToMiliseconds(0,0,0,1)
    TimeToMiliseconds(5,25,70,140)
}

private fun TimeToMiliseconds(days: Int, hours: Int, minutes: Int, seconds: Int){

    println ("$days dias, $hours horas, $minutes minutos y $seconds segundos equivalen a un total de " +
            "${((days * 24 * 60 * 60 * 1000) + 
                    (hours * 60 * 60 * 1000) + 
                    (minutes * 60 *1000) + 
                    (seconds * 1000))
                .toLong()} milisegundos")
}