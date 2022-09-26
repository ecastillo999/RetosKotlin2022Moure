package com.mouredev.weeklychallenge2022

/*
 * Reto #38
 * BINARIO A DECIMAL
 * Fecha publicación enunciado: 19/09/22
 * Fecha publicación resolución: 27/09/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa se encargue de transformar un número binario a decimal sin utilizar
 * funciones propias del lenguaje que lo hagan directamente.
 *
 * Información adicional:
 * - Usa el canal de nuestro Discord (https://mouredev.com/discord) "🔁reto-semanal"
 *   para preguntas, dudas o prestar ayuda a la comunidad.
 * - Tienes toda la información sobre los retos semanales en
 *   https://retosdeprogramacion.com/semanales2022.
 *
 */


fun main(){

    val binary1 = "10"
    val binary2 = "11"
    val binary3 = "1"
    val binary4 = "100"
    val binary5 = "111010110010110001111"

    print(binaryToDec(binary5))

}



fun binaryToDec(binary:String):Int {


    val stringArr = binary.reversed().toCharArray()

    var bitCounter =1

    var binary =0
   stringArr.forEach {

       if(it=='1'){
               binary+=bitCounter
       }
       bitCounter*=2
   }

    return binary
}