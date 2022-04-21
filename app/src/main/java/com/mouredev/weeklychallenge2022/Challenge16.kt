package com.mouredev.weeklychallenge2022


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


/**
 * Metodo Principal
 */
fun main(){

    val input = "En un lugar de la mancha,de cuyo nombre.no quiero acordarme....".firstLetterToUpper()
    println((input))

}

/**
 * Funcion de extension que convierte la primera letra de una cadena de texto a mayuscula
 * @return String con la primera letra en mayuscula de la cadena de texto
 */
fun String.firstLetterToUpper():String{
    val result=this.toCharArray()

    this.indexesOf("[ .,;]").forEach {
        if(it<this.length-1){
            result[it+1] = result[it+1].uppercaseChar()
        }
    }
    return String(result)
}

/**
 * Funcion de extension que devuelve todos los indices donde se encuentra un patron pasado por parametro
 * @param pattern patron a buscar
 * @return Lista de indices donde se encuentra el patron
 */
fun String?.indexesOf(pattern: String): List<Int> =
    pattern.toRegex()
        .findAll(this?: "")
        .map { it.range.first }
        .toList()

