/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weeklychallenge2022;

/*
 * Reto #2
 * LA SUCESIÓN DE FIBONACCI
 * Fecha publicación enunciado: 10/01/22
 * Fecha publicación resolución: 17/01/22
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Escribe un programa que imprima los 50 primeros números de la sucesión de Fibonacci empezando en 0.
 * La serie Fibonacci se compone por una sucesión de números en la que el siguiente siempre es la suma de los dos anteriores.
 * 0, 1, 1, 2, 3, 5, 8, 13...
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
/**
 *
 * @author Brais
 */
public class Challenge2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long inicial1 = 0,
                inicial2 = 1;

        fibonacci(inicial1, inicial2);

    }

    public static void fibonacci(long primero, long segundo) {

        System.out.print(primero + " " + segundo + " ");

        int largo = 50;
        long resultado;
        
        //empezamos en el 3 porque el 1 y el 2 ya se han mostrado
        for (int i = 3; i <= largo; i++) {
            resultado = primero + segundo;
            
            System.out.print(resultado + " ");
            if(i%10==0)System.out.println("");
            primero = segundo;
            segundo = resultado;
        }

    }

}
