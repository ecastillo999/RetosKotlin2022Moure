"use strict";
/*
 * Reto #3
 * ¿ES UN NÚMERO PRIMO?
 * Fecha publicación enunciado: 17/01/22
 * Fecha publicación resolución: 24/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
exports.__esModule = true;
exports.isPrimeNumber = void 0;
var printPrimeNumbers = function (to) {
    if (to === void 0) { to = 100; }
    for (var i = 1; i <= to; i++) {
        if ((0, exports.isPrimeNumber)(i)) {
            console.log(i);
        }
    }
};
var isPrimeNumber = function (testNumber) {
    if (testNumber < 2) {
        return false;
    }
    for (var divider = 2; divider < testNumber; divider++) {
        if (testNumber % divider === 0) {
            return false;
        }
    }
    return true;
};
exports.isPrimeNumber = isPrimeNumber;
printPrimeNumbers();
