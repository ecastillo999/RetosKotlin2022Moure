package es.jaimefere.weeklychallenge2022

/*
 * Reto #17
 * LA CARRERA DE OBSTÁCULOS
 * Fecha publicación enunciado: 25/04/22
 * Fecha publicación resolución: 02/05/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea una función que evalúe si un/a atleta ha superado correctamente una
 * carrera de obstáculos.
 * - La función recibirá dos parámetros:
 *      - Un array que sólo puede contener String con las palabras "run" o "jump"
 *      - Un String que represente la pista y sólo puede contener "_" (suelo) o "|" (valla)
 * - La función imprimirá cómo ha finalizado la carrera:
 *      - Si el/a atleta hace "run" en "_" (suelo) y "jump" en "|" (valla) será correcto y no
 *        variará el símbolo de esa parte de la pista.
 *      - Si hace "jump" en "_" (suelo), se variará la pista por "x".
 *      - Si hace "run" en "|" (valla), se variará la pista por "/".
 * - La función retornará un Boolean que indique si ha superado la carrera.
 * Para ello tiene que realizar la opción correcta en cada tramo de la pista.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

fun main() {
    println(checkRace(listOf(AthleteAction.RUN, AthleteAction.JUMP, AthleteAction.RUN, AthleteAction.JUMP, AthleteAction.RUN), "_|_|_"))
    println(checkRace(listOf(AthleteAction.RUN, AthleteAction.RUN, AthleteAction.RUN, AthleteAction.JUMP, AthleteAction.RUN), "_|_|_"))
    println(checkRace(listOf(AthleteAction.RUN, AthleteAction.RUN, AthleteAction.JUMP, AthleteAction.JUMP, AthleteAction.RUN), "_|_|_"))
    println(checkRace(listOf(AthleteAction.RUN, AthleteAction.RUN, AthleteAction.JUMP, AthleteAction.JUMP, AthleteAction.RUN), "_|_|_|_"))
    println(checkRace(listOf(AthleteAction.RUN, AthleteAction.JUMP, AthleteAction.RUN, AthleteAction.JUMP), "_|_|_"))
    println(checkRace(listOf(AthleteAction.RUN, AthleteAction.JUMP, AthleteAction.RUN, AthleteAction.JUMP, AthleteAction.RUN, AthleteAction.JUMP, AthleteAction.RUN), "_|_|_"))
    println(checkRace(listOf(AthleteAction.JUMP, AthleteAction.JUMP, AthleteAction.JUMP, AthleteAction.JUMP, AthleteAction.JUMP), "|||||"))
    println(checkRace(listOf(AthleteAction.JUMP, AthleteAction.JUMP, AthleteAction.JUMP, AthleteAction.JUMP, AthleteAction.JUMP), "||?||"))
}


private enum class AthleteAction(val segment: String) {
    JUMP("|"),
    RUN("_");

    companion object {
        fun getFail(obj: AthleteAction): String {
            return when (obj) {
                JUMP -> "/"
                RUN -> "x"
            }
        }
    }
}

private fun checkRace(athlete: List<AthleteAction>, track: String): Boolean {
    return if(athlete.size != track.length) {
        false
    } else {
        var athleteTrack = ""
        athlete.forEachIndexed { index, athleteAction ->
            athleteTrack += if(track[index].toString() != athleteAction.segment) AthleteAction.getFail(athleteAction) else athleteAction.segment
        }
        return athleteTrack == track
    }
}

