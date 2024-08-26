/*
 * Reto #8
 * DECIMAL A BINARIO
 * Fecha publicación enunciado: 18/02/22
 * Fecha publicación resolución: 02/03/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa se encargue de transformar un número decimal a binario sin utilizar funciones
 * propias del lenguaje que lo hagan directamente.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

import java.util.Scanner;

public class Challenge8 {

    public static void main(String[] args) {

        // El proceso de conversión de decimal a binario sigue dividiendo el número entre 2
        // hasta que el cociente sea 0. El residuo en cada división es el que se va acumulando
        // para formar el número binario (se debe invertir los residuos acumulados)

        Scanner leer = new Scanner(System.in);
        int numeroDecimal;
        String residuos = "";
        String numeroBinario = "";

        System.out.println("Ingresar un número decimal:");
        numeroDecimal = leer.nextInt();

        // Convertir el número decimal a binario
        while (numeroDecimal > 0) {
            residuos += (numeroDecimal % 2);
            numeroDecimal = numeroDecimal / 2;
        }

        // Invertir la cadena de residuos para obtener el binario correcto
        for (int i = residuos.length()-1; i >= 0; i--) {
            numeroBinario += residuos.charAt(i);
        }

        System.out.println("Número binario: " + numeroBinario);

    }
}
