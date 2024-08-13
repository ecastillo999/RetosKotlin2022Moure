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

public class Challenge7 {

    public static void main(String[] args) {

        String texto = "Hola, mi nombre es brais. Mi nombre completo es Brais Moure (MourdeDev).";

        // Se suprime los puntos, comas y paréntesis del texto
        texto = texto.replaceAll("[.,()]","");

        // Se almacenan las palabras separadas por un espacio en un array
        String[] palabras = texto.split(" ");

        for (int i = 0; i < palabras.length; i++) {
            int contador = 1; // Contar la primera aparición

            for (int j = i+1; j < palabras.length; j++) {
                if (palabras[i].equalsIgnoreCase(palabras[j])) {
                    contador ++;
                    palabras[j] = "";
                }
            }

            if(!palabras[i].isEmpty()) {
                System.out.println("");
                System.out.println("La palabra [" + palabras[i] + "] se repite " + contador + (contador == 1 ? " vez" : " veces"));
                System.out.println("");
            }
        }
    }
}
