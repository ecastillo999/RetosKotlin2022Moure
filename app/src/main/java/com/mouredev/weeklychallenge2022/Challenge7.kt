package com.mouredev.weeklychallenge2022

/*
 * Reto #7
 * CONTANDO PALABRAS
 * Fecha publicación enunciado: 14/02/22
 * Fecha publicación resolución: 21/02/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que cuente cuantas veces se repite cada palabra y que muestre el recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que lo resuelvan automáticamente.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */


fun main1(){

    wordsCount( "so we created this collection of online text tools. Unlike many other tools, we made our tools free")
}

fun wordsCount(text: String){
    val re = "[^A-Za-z0-9 ]".toRegex()
    val splitText = re.replace(text, "").lowercase().split(" ")

    for (i in splitText.indices){
        var countWord = 0
        val actualWord = splitText[i]
        for (j  in splitText.indices){
            val word = splitText[j]
            if ((word == actualWord)){
                countWord +=1
            }
        }

        println("la palabra $actualWord sale $countWord")
        countWord = 0
    }
}
fun main() {
    countWords("Hola, mi nombre es brais. Mi nombre completo es Brais Moure (MoureDev).")
}

fun countWords(text: String) {

    val words = mutableMapOf<String, Int>()

    text.lowercase().replace("[^a-z0-9]".toRegex(), " ").split(" ").forEach { key ->
        if (key.isEmpty()) {
            return@forEach
        }
        if (words[key] != null) {
            words[key] = words.getValue(key) + 1
        } else {
            words[key] = 1
        }
    }

    words.forEach { word ->
        println("${word.key} se ha repetido ${word.value} ${if(word.value == 1) "vez" else "veces"}")
    }
}

