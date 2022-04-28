package com.mouredev.weeklychallenge2022

/*
 * Reto #17
 * LA CARRERA DE OBSTÁCULOS
 * Fecha publicación enunciado: 25/04/22
 * Fecha publicación resolución: 02/05/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea una función que evalúe si un/a atleta ha superado correctamente una
 * carrera de obstáculos.
 * - La función recibirá dos parámetros:
 *      - Un array que sólo puede contener String con las palabras "run" o "jump"
 *      - Un String que represente la pista y sólo puede contener "_" (suelo) o "|" (valla)
 * - La función imprimirá cómo ha finalizado la carrera:
 *      - Si el/a atleta hace "run" en "_" (suelo) y "jump" en "|" (valla) será correcto y no
 *        variará el símbolo de esa parte de la pista.
 *      - Si hace "jump" en "_" (suelo), se variará la pista por "x".
 *      - Si hace "run" en "|" (valla), se variará la pista por "/".
 * - La función retornará un Boolean que indique si ha superado la carrera.
 * Para ello tiene que realizar la opción correcta en cada tramo de la pista.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

fun main(){
    val corredor = arrayOf("run", "jump")
    val circuito="_|"

    carrera(corredor, circuito)
}

fun carrera(corredor: Array<String>, circuito: String): Boolean {

    if (!comprobar_estado(corredor, circuito)) {
        return false
    }

    var pista = circuito
    //crea un bucle for que recorre pista y comprueba cada caracter
    for (i in pista.indices){
        if (pista[i] == '|'){
            if (corredor[i]== "run") {
                pista = pista.replaceRange(i, i + 1, "/")
            } else {
                return false
            }
        }
        else if (pista[i] == '_'){
            if (corredor[i]== "jump") {
                pista = pista.replaceRange(i, i + 1, "x")
            } else {
                return false
            }
        }
    }
    print("Pista: {$pista}")
    return true
}

fun comprobar_estado(corredor: Array<String>, circuito: String): Boolean{
    if (corredor.size != circuito.length){
        return false
    }

    corredor.forEach {
        if ((it != "run") && ( it != "jump")){
            return false
        }
    }

    circuito.forEach{
        if ((it != '_') && (it != '|')){
            return false
        }
    }
    return true
}