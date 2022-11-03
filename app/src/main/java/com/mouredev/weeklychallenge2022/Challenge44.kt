package com.mouredev.weeklychallenge2022

/*
 * Reto #44
 * BUMERANES
 * Fecha publicación enunciado: 02/10/22
 * Fecha publicación resolución: 07/11/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que retorne el número total de bumeranes de un array de números
 * enteros e imprima cada uno de ellos.
 * - Un bumerán (búmeran, boomerang) es una secuencia formada por 3 números seguidos, en el que el
 *   primero y el último son iguales, y el segundo es diferente. Por ejemplo [2, 1, 2].
 * - En el array [2, 1, 2, 3, 3, 4, 2, 4] hay 2 bumeranes ([2, 1, 2] y [4, 2, 4]).
 *
 * Información adicional:
 * - Usa el canal de nuestro Discord (https://mouredev.com/discord) "🔁reto-semanal"
 *   para preguntas, dudas o prestar ayuda a la comunidad.
 * - Tienes toda la información sobre los retos semanales en
 *   https://retosdeprogramacion.com/semanales2022.
 *
 */
fun main(){
	boomerang(arrayOf(2, 1, 2, 3, 3, 4, 2, 4))
}

fun boomerang(array:Array<Int>){

	fun getBoomerangs(array:Array<Int>):ArrayList<Array<Int>> {
		var boomerangs= ArrayList<Array<Int>>()
		if (array.size < 3){
			return boomerangs
		}
		for (c in 1..array.size -2){
			val pre = array[c-1]
			val act = array[c]
			val next = array[c+1]
			if ( pre == next && pre != act){
				boomerangs.add(arrayOf(pre,act,next))
			}
		}
		return boomerangs
	}
	val b = getBoomerangs(array)

	b.forEach({ index -> println(index.contentToString()) })
}
