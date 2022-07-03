package es.jaimefere.weeklychallenge2022

/*
 * Reto #25
 * PIEDRA, PAPEL, TIJERA
 * Fecha publicación enunciado: 20/06/22
 * Fecha publicación resolución: 27/06/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que calcule quien gana más partidas al piedra, papel, tijera.
 * - El resultado puede ser: "Player 1", "Player 2", "Tie" (empate)
 * - La función recibe un listado que contiene pares, representando cada jugada.
 * - El par puede contener combinaciones de "R" (piedra), "P" (papel) o "S" (tijera).
 * - Ejemplo. Entrada: [("R","S"), ("S","R"), ("P","S")]. Resultado: "Player 2".
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

private enum class Move {
    ROCK, PAPER, SCISSOR
}

private fun playRockPaperScissor(moves: Array<Pair<Move, Move>>): String {
    var playerOneWins = 0
    var playerTwoWins = 0

    moves.forEach { move ->
        if(move.first != move.second) {
            if ((move.first == Move.SCISSOR && move.second == Move.PAPER) || (move.first == Move.PAPER && move.second == Move.ROCK) || (move.first == Move.ROCK && move.second == Move.SCISSOR)) {
                playerOneWins++
            } else {
                playerTwoWins++
            }
        }
    }

    return if(playerOneWins == playerTwoWins) "Tie" else if(playerOneWins > playerTwoWins) "Player 1" else "Player 2"
}

fun main() {
    println(playRockPaperScissor(arrayOf(Pair(Move.ROCK,Move.SCISSOR), Pair(Move.SCISSOR,Move.ROCK), Pair(Move.PAPER,Move.SCISSOR))))
    println(playRockPaperScissor(arrayOf(Pair(Move.ROCK,Move.ROCK), Pair(Move.SCISSOR,Move.SCISSOR), Pair(Move.PAPER,Move.PAPER))))
}