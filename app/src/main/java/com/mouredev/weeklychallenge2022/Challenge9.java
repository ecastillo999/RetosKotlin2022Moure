/*
 * Reto #9
 * CÓDIGO MORSE
 * Fecha publicación enunciado: 02/03/22
 * Fecha publicación resolución: 07/03/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que sea capaz de transformar texto natural a código morse y viceversa.
 * - Debe detectar automáticamente de qué tipo se trata y realizar la conversión.
 * - En morse se soporta raya "—", punto ".", un espacio " " entre letras o símbolos y dos espacios entre palabras "  ".
 * - El alfabeto morse soportado será el mostrado en https://es.wikipedia.org/wiki/Código_morse.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Challenge9 {

    // Definición e inicialización de mapas de conversión
    private static final Map<Character, String> MapTextoAMorse = new HashMap<>();
    private static final Map<String, Character> MapMorseATexto = new HashMap<>();

    static {
        // Mapa que almacena la correspondencia entre caracteres de texto y sus equivalentes en código Morse
        MapTextoAMorse.put('a', ".—");
        MapTextoAMorse.put('b', "—...");
        MapTextoAMorse.put('c', "—.—.");
        MapTextoAMorse.put('d', "—..");
        MapTextoAMorse.put('e', ".");
        MapTextoAMorse.put('f', "..—.");
        MapTextoAMorse.put('g', "——.");
        MapTextoAMorse.put('h', "....");
        MapTextoAMorse.put('i', "..");
        MapTextoAMorse.put('j', ".———");
        MapTextoAMorse.put('k', "—.—");
        MapTextoAMorse.put('l', ".—..");
        MapTextoAMorse.put('m', "——");
        MapTextoAMorse.put('n', "—.");
        MapTextoAMorse.put('ñ', "——.——");
        MapTextoAMorse.put('o', "———");
        MapTextoAMorse.put('p', ".——.");
        MapTextoAMorse.put('q', "——.—");
        MapTextoAMorse.put('r', ".—.");
        MapTextoAMorse.put('s', "...");
        MapTextoAMorse.put('t', "—");
        MapTextoAMorse.put('u', "..—");
        MapTextoAMorse.put('v', "...—");
        MapTextoAMorse.put('w', ".——");
        MapTextoAMorse.put('x', "—..—");
        MapTextoAMorse.put('y', "—.——");
        MapTextoAMorse.put('z', "——..");
        MapTextoAMorse.put('0', "—————");
        MapTextoAMorse.put('1', ".————");
        MapTextoAMorse.put('2', "..———");
        MapTextoAMorse.put('3', "...——");
        MapTextoAMorse.put('4', "....—");
        MapTextoAMorse.put('5', ".....");
        MapTextoAMorse.put('6', "—....");
        MapTextoAMorse.put('7', "——...");
        MapTextoAMorse.put('8', "———..");
        MapTextoAMorse.put('9', "————.");
        MapTextoAMorse.put('.', ".—.—.—");
        MapTextoAMorse.put(',', "——..——");
        MapTextoAMorse.put('?', "..——..");
        MapTextoAMorse.put(' ', " ");

        // Recorre todas las entradas de MapTextoAMorse y las invierte para llenar MapMorseATexto
        for (Map.Entry<Character, String> entry : MapTextoAMorse.entrySet()) {
            MapMorseATexto.put(entry.getValue(), entry.getKey());
        }
    }

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese texto o código Morse:");
        String inputUsuario = leer.nextLine();

        // Comprobar si la entrada consiste solo en caracteres Morse (., —, y espacios).
        // Si es así, se asume que la entrada es código Morse, de lo contrario, es texto normal.
        if (inputUsuario.matches("[\\.—\\s]+")) {
            System.out.println("Detectado código Morse. Convertiendo a texto:");
            System.out.println(convertirMorseATexto(inputUsuario));
        } else {
            System.out.println("Detectado texto normal. Convertiendo a código Morse:");
            System.out.println(convertirTextoAMorse(inputUsuario));
        }


    }

    // Este método convierte texto a código Morse
    private static String convertirTextoAMorse(String texto) {

        StringBuilder codigoMorse = new StringBuilder();

        // Dividir el texto en palabras utilizando el espacio como delimitador
        String[] textoArray = texto.toLowerCase().split(" ");

        // Recorrer cada palabra del texto
        for (int i = 0; i < textoArray.length; i++) {

            String palabra = textoArray[i];

            // Recorrer cada letra de la palabra
            for (int j = 0; j < palabra.length(); j++) {
                char letra = palabra.charAt(j);
                // Agrega el código Morse correspondiente a la letra actual
                String morseChar = MapTextoAMorse.get(letra);
                if (morseChar != null) {
                    codigoMorse.append(morseChar);
                    if (j < palabra.length() - 1) {
                        // Añadir un espacio entre letras, excepto después de la última letra
                        codigoMorse.append(" ");
                    }
                }
            }
            if (i < textoArray.length - 1) {
                // Añadir dos espacios entre palabras
                codigoMorse.append("  ");
            }
        }
        return codigoMorse.toString().trim();
    }

    // Este método convierte código Morse a texto:
    private static String convertirMorseATexto(String morse) {

        StringBuilder texto = new StringBuilder();

        // Divide la cadena Morse en palabras utilizando dos espacios como delimitador.
        String[] palabrasMorse = morse.split("  ");

        // Recorre cada palabra en código Morse.
        for (String palabraMorse : palabrasMorse) {
            // Divide cada palabra en letras y convierte cada letra de Morse a texto usando el mapa.
            for (String letraMorse : palabraMorse.split(" ")) {
                texto.append(MapMorseATexto.getOrDefault(letraMorse, ' '));
            }
            // Añade un espacio entre palabras en la cadena de texto.
            texto.append(" ");
        }

        return texto.toString().trim();
    }

}

