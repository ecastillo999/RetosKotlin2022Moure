package com.mouredev.weeklychallenge2022

/*
 * Reto #30
 * MARCO DE PALABRAS
 * Fecha publicación enunciado: 26/07/22
 * Fecha publicación resolución: 01/08/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que reciba un texto y muestre cada palabra en una línea, formando
 * un marco rectangular de asteriscos.
 * - ¿Qué te parece el reto? Se vería así:
 *   **********
 *   * ¿Qué   *
 *   * te     *
 *   * parece *
 *   * el     *
 *   * reto?  *
 *   **********
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

fun main() {
    val palabra = "¿Qué te parece el reto?"
    crearMarco(palabra)
}

fun crearMarco(palabra: String) {
    val palabras = palabra.split(" ")
    var marco = ""
    var long_mayor = 0
    for (i in palabras) {

        if (i.length > long_mayor){
            long_mayor = i.length
        }
    }
    for (i in palabras) {
        marco += laterales(i, long_mayor)
    }
    long_mayor+=4
    print("${"*".repeat(long_mayor)}\n${marco}${"*".repeat(long_mayor)}")
}

fun laterales(palabra: String, longitud: Int): String {
    val l = longitud - palabra.length
    val derecha = " ".repeat(l)

    return "* $palabra ${derecha}*\n"

}