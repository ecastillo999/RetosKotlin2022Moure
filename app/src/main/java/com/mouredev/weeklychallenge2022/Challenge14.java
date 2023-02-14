/*
 * Reto #14
 * ¿ES UN NÚMERO DE ARMSTRONG?
 * Fecha publicación enunciado: 04/04/22
 * Fecha publicación resolución: 11/04/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Escribe una función que calcule si un número dado es un número de Amstrong (o también llamado narcisista).
 * Si no conoces qué es un número de Armstrong, debes buscar información al respecto.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

public class Challenge14 {
    public static void main(String[] args) {
        numAmstrong(4210818);
    }

    private static void numAmstrong(int i) {
        String integerData[] = Integer.toString(i).split("");
        double result = 0;
        for (int j = 0; j < integerData.length; j++) {
            result = result + Math.pow(Double.parseDouble(integerData[j]) , Double.parseDouble(String.valueOf(integerData.length)));
        }
        if (result == Double.parseDouble(String.valueOf(i))) {
            System.out.println("It's an Amstrong number.");
        } else {
            System.out.println("It's NOT an Amstrong number.");
        }
        
    }
}

//https://es.farnell.com/tr-fastenings/m410-bh10mcz100/tornillo-allen-tope-m4-x-10/dp/1420708
