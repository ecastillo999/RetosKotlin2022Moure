package com.mouredev.weeklychallenge2022

import java.io.File

/*
 * Reto #21
 * CALCULADORA .TXT
 * Fecha publicación enunciado: 23/05/22
 * Fecha publicación resolución: 01/06/22
 * Dificultad: MEDIA
 *
 * Enunciado: Lee el fichero "Challenge21.txt" incluido en el proyecto, calcula su resultado e imprímelo.
 * - El .txt se corresponde con las entradas de una calculadora.
 * - Cada línea tendrá un número o una operación representada por un símbolo (alternando ambos).
 * - Soporta números enteros y decimales.
 * - Soporta las operaciones suma "+", resta "-", multiplicación "*" y división "/".
 * - El resultado se muestra al finalizar la lectura de la última línea (si el .txt es correcto).
 * - Si el formato del .txt no es correcto, se indicará que no se han podido resolver las operaciones.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

fun main(){
    val fileName1 = "Challenge21.txt"
    println(getDataFromFile(fileName1))

    val fileName2 = "Challenge21Wrong.txt"
    println(getDataFromFile(fileName2))
}

private fun getDataFromFile(fileName : String) : Float?{
    var result : Float? = null
    try {
        val rootFolder = "app/src/main/java/com/mouredev/weeklychallenge2022/"
        val data = File(rootFolder,fileName).readLines()
        data.forEach { print(it) }
        print("\n")
        result = compute(data)
    } catch (e:Exception){
        print(e)
    }
    return result
}

private fun compute(operationList : List<String>):Float?{
    val result = ArrayList<String>()
    val itIsOk = validate(operationList)

    return if (!itIsOk){
        println("Error in the file data")
        null
    } else{
        var i = 1
        var jump = false
        try {
            while ( i<operationList.size ){
                jump = if (operationList[i] == "*"){
                    result.add((operationList[i-1].toFloat()*operationList[i+1].toFloat()).toString())
                    true
                } else if (operationList[i] == "/"){
                    result.add((operationList[i-1].toFloat()/operationList[i+1].toFloat()).toString())
                    true
                } else {
                    if (!jump)
                        result.add(operationList[i-1])
                    result.add(operationList[i])
                    false
                }
                i+=2
            }
        }catch (e : ArithmeticException){
            println(e.message)
            return null
        }

        i = 1
        var resultFinal = result[0].toFloat()
        result.forEach{ print(it)}
        print("\n")
        while (i<result.size){
            if (result[i] == "+")
                resultFinal += result[i+1].toFloat()
            else
                resultFinal -= result[i+1].toFloat()
            i+=2
        }
        return resultFinal
    }
}

private fun validate(operationList: List<String>) : Boolean{
    var oneLine = ""
    operationList.forEach { oneLine += it }
    return oneLine.matches("""([+/*-]?[0-9*]\.?[0-9*]?)*""".toRegex())
}