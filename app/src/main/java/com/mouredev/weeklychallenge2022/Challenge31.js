/*
 * Reto #31
 * AÑOS BISIESTOS
 * Fecha publicación enunciado: 01/08/22
 * Fecha publicación resolución: 08/08/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que imprima los 30 próximos años bisiestos siguientes a uno dado.
 * - Utiliza el menor número de líneas para resolver el ejercicio.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
//Para ejecutar el codigo:
// $ node Challenge31.js
const aniosBisiestos = (actual_year, nro) => {
    if (nro <= 0) return;
    actual_year += 4 - actual_year % 4;
    (actual_year % 100 != 0 || actual_year % 400 == 0) ? console.log(actual_year) : nro++;
    return aniosBisiestos(actual_year, --nro);
}
aniosBisiestos(2022, 30) //Obtener los proximos 30 años bisiestos