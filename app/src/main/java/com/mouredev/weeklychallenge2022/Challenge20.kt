package com.mouredev.weeklychallenge2022

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
 * Reto #20
 * PARANDO EL TIEMPO
 * Fecha publicación enunciado: 16/05/22
 * Fecha publicación resolución: 23/05/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea una función que sume 2 números y retorne su resultado pasados unos segundos.
 * - Recibirá por parámetros los 2 números a sumar y los segundos que debe tardar en finalizar su ejecución.
 * - Si el lenguaje lo soporta, deberá retornar el resultado de forma asíncrona, es decir, sin detener la ejecución del programa principal. Se podría ejecutar varias veces al mismo tiempo.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

fun main(){
    runBlocking{
        launch {
            println(sum(1,1,500L))
        }
        launch {
            println(sum(1,2,1L))
        }
        launch {
            println(sum(1,3,10L))
        }
        launch {
            println(sum(1,4,0L))
        }
        launch {
            println(sum(1,5,100L))
        }
        launch {
            launch{println(sum(1,6,2L))}
        }
    }

}

private suspend fun sum(numberOne:Int, numberTwo:Int, sec:Long):Int{
    delay(sec)
    return numberOne + numberTwo
}

