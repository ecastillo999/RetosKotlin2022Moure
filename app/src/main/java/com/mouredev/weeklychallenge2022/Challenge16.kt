package com.mouredev.weeklychallenge2022


import java.util.*

/*
 * Reto #16
 * EN MAYÚSCULA
 * Fecha publicación enunciado: 18/04/22
 * Fecha publicación resolución: 25/04/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que reciba un String de cualquier tipo y se encargue de
 * poner en mayúscula la primera letra de cada palabra.
 * - No se pueden utilizar operaciones del lenguaje que lo resuelvan directamente.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */



fun main() {
     println(" hóla user1235, viva él    ".firstLettersUpperCase())
     println("tengo 80 años ya".firstLettersUpperCase())
     println("árboles verdes".firstLettersUpperCase())
     println("Óscar a will Smith; por ñoño ".firstLettersUpperCase())
}

fun String.firstLettersUpperCase() =
     this.trim().split("\\s".toRegex()).joinToString(" ") { it.capitalFirstLetter() }

fun String.capitalFirstLetter(): String {
     if (this.isLowerCase()) {
          return (this[0].code - 32).toChar() + this.substring(1)
     }
     return this
}

fun String.isLowerCase() = this[0].isLetter() && this[0].isLowerCase()
