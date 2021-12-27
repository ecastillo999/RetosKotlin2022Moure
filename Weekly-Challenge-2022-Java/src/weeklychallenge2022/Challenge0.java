package weeklychallenge2022;

/*
 * Reto #0
 * EL FAMOSO "FIZZ BUZZ"
 * Fecha publicación enunciado: 27/12/21
 * Fecha publicación resolución: 03/01/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Escribe un programa que muestre por consola (con un print) los números de 1 a 100 (ambos incluidos y con un salto de línea entre cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🗓reto-semanal" para preguntas, dudas o prestar ayuda la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

/**
 *
 * @author Brais
 */
public class Challenge0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int limite = 100;
        for (int i = 1; i <= limite; i++) {
            fizzBuzz(i);
        }
    }

    private static void fizzBuzz(int numero) {
        boolean fizz = numero % 3 == 0,
                buzz = numero % 5 == 0,
                fizzBuzz = numero % 15 == 0;
        if (fizzBuzz) {
            System.out.println("fizzbuzz");
        } else if (fizz) {
            System.out.println("fizz");
        } else if (buzz) {
            System.out.println("buzz");
        } else {
            System.out.println(numero);
        }
    }
}
