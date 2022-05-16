package com.mouredev.weeklychallenge2022

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

fun main() {
  val sum1 = Thread {
    val r = suma(1, 0, 2)
    //println("thread: ${Thread.currentThread()} - resultado: $r")
  }

  val sum2 = Thread {
    val r = suma(2, 0, 10)
   // println("thread: ${Thread.currentThread()} - resultado: $r")
  }
  sum1.start()
  sum2.start()
  suma(3,0,0)
}

fun suma(num1: Int, num2: Int, segundos: Long): Int {
  val r = num1 + num2
  Thread.sleep(segundos * 1000)
  println("$num1 + $num2 = $r")
  return r
}