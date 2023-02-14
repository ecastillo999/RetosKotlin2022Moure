/*
 * Reto #12
 * ¿ES UN PALÍNDROMO?
 * Fecha publicación enunciado: 21/03/22
 * Fecha publicación resolución: 28/03/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba un texto y retorne verdadero o falso (Boolean) según sean o no palíndromos.
 * Un Palíndromo es una palabra o expresión que es igual si se lee de izquierda a derecha que de derecha a izquierda.
 * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
 * Ejemplo: Ana lleva al oso la avellana.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

public class Challenge12 {
    public static void main(String[] args) {
        System.out.println(esPalindromo("Ana lleva al oso la avellana."));
    }

    private static boolean esPalindromo(String words) {

        words = words.replaceAll("\\W+", "").toLowerCase();

        int stringLength = words.length();
        boolean palindromo = true;
        for (int i = 0; i < stringLength; i++) {
            if (words.charAt(i) != words.charAt(stringLength - (i + 1))) {
                palindromo = false;
            }
        }
        return palindromo;
    }
}
