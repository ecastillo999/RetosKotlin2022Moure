package com.mouredev.weeklychallenge2022

/*
 * Reto #4
 * ÁREA DE UN POLÍGONO
 * Fecha publicación enunciado: 24/01/22
 * Fecha publicación resolución: 31/01/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

fun main() {
  val poligono1 = "3 5 4"
  val poligono2 = "4"
  val poligono3 = "3 4"

  areaPoligono(poligono1)
  areaPoligono(poligono2)
  areaPoligono(poligono3)
}

fun areaPoligono(poligono: String) {
  val input = poligono.split(" ")
  var lados = DoubleArray(input.size) { input[it].toDouble() }

  var area: Double; area2: Double

  if (lados.size == 1) {
    area = Math.pow(lados[0].toDouble(), 2.0)
    println("El área del cuadrado es: $area")
  } else if (lados.size == 2) {
    area = lados[0].toDouble() * lados[1].toDouble()
    area2 = (lados[0].toDouble() * lados[1].toDouble()) / 2
    println("El área del rectángulo es: $area ; El área del triángulo es: $area2")
  } else {
    lados = lados.sortedArray()
    area = (lados[0].toDouble() * lados[1].toDouble()) / 2
    println("El área del triangulo es: $area")
  }
}
