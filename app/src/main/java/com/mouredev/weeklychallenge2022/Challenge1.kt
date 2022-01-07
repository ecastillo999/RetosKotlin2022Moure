package com.mouredev.weeklychallenge2022

/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Fecha publicación enunciado: 03/01/22
 * Fecha publicación resolución: 10/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 * Ejemplo: "casa" es una anagrama de "saca"
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🗓reto-semanal" para preguntas, dudas o prestar ayuda la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

fun main() {

    //Función que cuenta el número de apariencias de una determinada letra dentro de una palabra
    fun contadorOcurrencias (palabra: String, letra: Char): Int {
        return palabra.filter { it == letra }.length
    }

    //Función para dar formato a las distintas palabras
    fun formatearPalabra(palabra: String): String {
        return palabra.lowercase().trim()
            .replace(" ", "")
            .replace("á","a")
            .replace("é","e")
            .replace("í","i")
            .replace("ó","o")
            .replace("ú","u")
    }

    //Función principal del reto
    fun esAnagrama (palabraUno : String, palabraDos : String) : Boolean{
        val palabraUnoFormateada = formatearPalabra(palabraUno)
        val palabraDosFormateada = formatearPalabra(palabraDos)

        if((palabraUnoFormateada.length != palabraDosFormateada.length) || palabraUnoFormateada == palabraDosFormateada){
            return false
        }

        for(letra in palabraUnoFormateada) {
            val aparicionesEnPalabraUnoFormateada = contadorOcurrencias(palabraUnoFormateada, letra)
            val aparicionesEnPalabraDosFormateada = contadorOcurrencias(palabraDosFormateada, letra)

            if(aparicionesEnPalabraUnoFormateada != aparicionesEnPalabraDosFormateada){
                return false
            }
        }
        return true
    }

    //LLAMADA A LA FUNCIÓN PRINCIPAL
    if(esAnagrama("canción         ","noi             cnac")){
        println("SON ANAGRAMAS")

    }else{
        println("NO SON ANAGRAMAS")
    }
}
