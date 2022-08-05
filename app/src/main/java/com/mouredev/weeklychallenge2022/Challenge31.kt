package com.mouredev.weeklychallenge2022

/*
 * Reto #31
 * AÑOS BISIESTOS
 * Fecha publicación enunciado: 01/08/22
 * Fecha publicación resolución: 08/08/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que imprima los 30 próximos años bisiestos siguientes a uno dado.
 * - Utiliza el menor número de líneas para resolver el ejercicio.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

/**
 * Funcion Principal
 */
fun main(){
    print(leapYears(2022,30))
}

/**
 * Funcion que calcula los n proximos años bisiestos a uno dado
 * @param year a partir del cual se imprimiran los años bisiestos
 * @param n numero de años a imprimir
 */
fun leapYears(year: Int,n:Int): List<Int> {
    val leapYears = mutableListOf<Int>()
    var currentYear = year
    while(leapYears.size<n){
        if (isLeapYear(currentYear)) leapYears.add(currentYear)
        currentYear++
    }
    return leapYears
}

/**
 * Funcion que determina si un año es bisiesto
 * Año bisiesto es el divisible entre 4, salvo que sea año secular -último de cada siglo, terminado en «00»-, en cuyo caso también ha de ser divisible entre 400.
 * @param year año a determinar si es bisiesto
 * @return true si el año es bisiesto, false en caso contrario
 */
private fun isLeapYear(year: Int): Boolean {
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0
}