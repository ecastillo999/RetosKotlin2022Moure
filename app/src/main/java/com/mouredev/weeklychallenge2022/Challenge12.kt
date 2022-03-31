package com.mouredev.weeklychallenge2022

import java.text.Normalizer
import java.util.*

/*
 * Reto #12
 * ¿ES UN PALÍNDROMO?
 * Fecha publicación enunciado: 21/03/22
 * Fecha publicación resolución: 28/03/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba un texto y retorne verdadero o falso (Boolean) según sean o no palíndromos.
 * Un Palíndromo es una palabra o expresión que es igual si se lee de izquierda a derecha que de derecha a izquierda.
 * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
 * Ejemplo: Ana lleva al oso la avellana.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

fun main (){
    println(palindroma("arozzora"))
    println(palindroma("ada"))
    println(palindroma("hola como estas satse omoc aloh"))
    println(palindroma("hola"))
    println(palindroma("àna lleva al oso la avellana"))
}

fun palindroma(text: String) : Boolean {
    var limpio: String?
    val valor: String = text.lowercase()
    limpio = Normalizer.normalize(valor, Normalizer.Form.NFD)

    limpio = limpio.replace("[^\\p{ASCII}(N\u0303)(n\u0303)(\u00A1)(\u00BF)(\u00B0)(U\u0308)]".toRegex(), "")

    limpio = Normalizer.normalize(limpio, Normalizer.Form.NFC)
    limpio = limpio.lowercase()

    val charArray = limpio.replace(" ", "").toCharArray()

    var i = 0
    var j = charArray.size - 1

    while (i != charArray.size){
        if (charArray[i] != charArray[j]){
            return false
        }
        i++
        j--
    }
    return true
}