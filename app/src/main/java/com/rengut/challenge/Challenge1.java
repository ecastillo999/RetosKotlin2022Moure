package com.rengut.challenge;

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
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class Challenge1 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String param1 = sc.next();
        String param2 = sc.next();

        boolean response = isAnagram(param1, param2);

        System.out.println(response);
    }

    public static boolean isAnagram(String param1, String param2) {

        String word1 = param1.toLowerCase();
        String word2 = param2.toLowerCase();

        if (word1.isEmpty() || word2.isEmpty()) {
            return false;
        }
        if (word1.compareTo(word2) == 0) {
            return false;
        }

        char[] word1Arr = word1.toCharArray();
        char[] word2Arr = word2.toCharArray();

        Arrays.sort(word1Arr);
        Arrays.sort(word2Arr);

        return Arrays.equals(word1Arr, word2Arr);
    }
}
