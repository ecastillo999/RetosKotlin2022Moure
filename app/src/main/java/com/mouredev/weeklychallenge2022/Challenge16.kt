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

fun main() {
  val frase="Hola mundo"
  println(UpperCase(frase))
}

fun UpperCase(frase:String):String{
  val minus="abcdefghijklmnñopqrstuvwxyz"
  val mayus="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ"
	var frase2=""
  for (i in 0..frase.length-1){
    if (minus.contains(frase[i])){
     frase2+=mayus[minus.indexOf(frase[i])]
    }
    else{
      frase2+=frase[i].toString()
    }
  }
  return frase2
}