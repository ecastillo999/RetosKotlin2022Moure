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
/**
 * Challenge8
 */
public class Challenge8 {

    public static void main(String[] args) {
        System.out.println(convertToint(451));
    }

    /**
     * @param binaryNum Int to convert to binary.
     * @return Return String with the coversion to binary number.
     */
    static String convertToint(int binaryNum) {

        Double valor = (double) binaryNum; //
        String resultString = "";
        Boolean finished = false;

        while (!finished) {
            if ((valor % 2) != 0) {
                resultString = "1" + resultString;
            } else if((valor % 2) == 0){
                resultString = "0" + resultString;
            }
            valor = Math.floor(valor/2);
            if (valor == 1) {
                resultString = "1" + resultString;
                finished = true;
            }
        }
        return resultString;
    }
}