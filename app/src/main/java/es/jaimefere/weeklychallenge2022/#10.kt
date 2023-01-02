package es.jaimefere.weeklychallenge2022

/*
 * Reto #10
 * EXPRESIONES EQUILIBRADAS
 * Fecha publicación enunciado: 07/03/22
 * Fecha publicación resolución: 14/03/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que comprueba si los paréntesis, llaves y corchetes de una expresión están equilibrados.
 * - Equilibrado significa que estos delimitadores se abren y cieran en orden y de forma correcta.
 * - Paréntesis, llaves y corchetes son igual de prioritarios. No hay uno más importante que otro.
 * - Expresión balanceada: { [ a * ( c + d ) ] - 5 }
 * - Expresión no balanceada: { a * ( c + d ) ] - 5 }
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

fun isBalanced(expression: String): Boolean {
    val couples = arrayOf("{}","()","[]")
    val onlyBrackets = expression.filter{ char -> couples.map{ it[0] }.contains(char) || couples.map{ it[1] }.contains(char) }
    val firstCloseBracketIndex = onlyBrackets.indexOfAny(couples.map{ it[1].toString() })

    return if(firstCloseBracketIndex < 1) {
        false
    } else if(onlyBrackets.length == 2) {
        couples.contains(onlyBrackets)
    } else {
        val prevExpression = onlyBrackets.substring(firstCloseBracketIndex-1,firstCloseBracketIndex+1)
        val restExpression = onlyBrackets.substring(0, firstCloseBracketIndex-1) + onlyBrackets.substring(firstCloseBracketIndex+1)
        isBalanced(prevExpression) && isBalanced(restExpression)
    }
}

fun main() {
    val balancedExpressions = arrayOf("{ [ a * ( c + d ) ] - 5 }", "[()]{}{[()()]()}", "{[{}{}]}[()]", "{{}{}}", "[]{}()", "a+2")
    balancedExpressions.forEach { expression ->
        println("$expression ${if(!isBalanced("($expression)")) "NO " else ""}está balanceada")
    }
    println()
    val notBalancedExpressions = arrayOf( "{ a * ( c + d ) ] - 5 }", "[(])", "{()}[)", "{(})", "{")
    notBalancedExpressions.forEach { expression ->
        println("$expression ${if(!isBalanced(expression)) "NO " else ""}está balanceada")
    }
}