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
   boomerang(arrayOf(2, 1, 2, 3, 3, 4, 2, 4, 4,8,4,2,10,6))
}

private fun boomerang(numbers:Array<Int>):Int{
    var boomerangs=0
    val boomerangsList:ArrayList<Int> = arrayListOf()

    for(num in numbers.indices){
        val temp=numbers[num]
        if(num<numbers.size - 2 && numbers[num]==numbers[num + 2]){
            boomerangs++
            boomerangsList.add(temp)
            boomerangsList.add(numbers[num+1])
            boomerangsList.add(numbers[num+2])
        }

    }
    println("Hay $boomerangs boomerangs")
    println(boomerangsList)
    return boomerangs
}
