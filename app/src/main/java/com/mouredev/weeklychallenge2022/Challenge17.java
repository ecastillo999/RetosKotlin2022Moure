import java.lang.reflect.Array;

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

public class Challenge17 {

    private static final String wordRun = "run";
    private static final String wordJump = "jump";
    private static final String CharJumpErr = "/";
    private static final String charRunErr = "x";

    public static void main(String[] args) {
        String carrera[] = { "run", "run", "jump", "run", "jump", "jump", "run", "run" };
        String pista = "__|_||__";

        System.out.println(carreraObstaculos(carrera, pista));
    }

    private static boolean carreraObstaculos(String[] carrera, String pista) {
        String result = "";
        Boolean finished = true;
        for (int i = 0; i < pista.length(); i++) {

            switch (String.valueOf(pista.charAt(i))) {
                case "_":
                    if (carrera[i].equals(wordRun)) {
                        result += pista.substring(i, i + 1);
                    } else {
                        finished = false;
                        result += charRunErr;
                    }

                    break;

                case "|":
                    if (carrera[i].equals(wordJump)) {
                        result += pista.substring(i, i + 1);
                    } else {
                        finished = false;
                        result += CharJumpErr;
                    }
                    break;

                default:
                    finished = false;
                    return finished;
            }
        }
        System.out.println("La carrera ha estado: " + result);
        return finished;
    }
}
