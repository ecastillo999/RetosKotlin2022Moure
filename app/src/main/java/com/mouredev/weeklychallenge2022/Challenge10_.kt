package com.mouredev.weeklychallenge2022

/*
 * Reto #10
 * EXPRESIONES EQUILIBRADAS
 * Fecha publicación enunciado: 07/03/22
 * Fecha publicación resolución: 14/03/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que comprueba si los paréntesis, llaves y corchetes de una expresión
 * están equilibrados.
 * - Equilibrado significa que estos delimitadores se abren y cieran en orden y de forma correcta.
 * - Paréntesis, llaves y corchetes son igual de prioritarios. No hay uno más importante que otro.
 * - Expresión balanceada: { [ a * ( c + d ) ] - 5 }
 * - Expresión no balanceada: { a * ( c + d ) ] - 5 }
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas,
 * dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución
 * aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

fun main() {
    balanced("{ [ a * ( c + d ) + ( 2 - 3 )] - 5 }")
    balanced("{ a * ( c + d  + (2 - 3) ] - 5 }")
    balanced("{ a * ( c + d  + (2 - 3) } - 5 ]")
}

fun balanced(text: String){
    var isBalanced = true
    var charPosicion = 0
    val lastopen = mutableListOf<String>()
    val delimiters = mapOf('(' to ')', '[' to ']', '{' to '}')
    while (charPosicion < text.length) {
        for ((key, value) in delimiters) {
            if (text.count { it.equals(key) } != text.count { it.equals(value) }){
                isBalanced = false
                break
            }
            if (text[charPosicion].equals(key))
                lastopen.add(text[charPosicion].toString())
            else if (text[charPosicion].equals(value))
                if (lastopen.isNotEmpty() && lastopen.last().contains(key)){
                    lastopen.removeLast()
                }else{
                    isBalanced = false
                    break
                }
        }
        charPosicion++
    }
    println(if (isBalanced) "$text Está balanceada" else "$text No está balanceada")
}
