/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */

function fizzBuzz(string1, string2) {
  let cuenta = 0;
  for (let contador = 1; contador < 100 + 1; contador++) {
    if (contador % 3 == 0 && contador % 5 == 0) {
      console.log(string1 + string2);
    } else if (contador % 3 == 0) {
      console.log(string1);
    } else if (contador % 5 == 0) {
      console.log(string2);
    } else {
      console.log(contador);
      cuenta++;
    }
  }
  return cuenta;
}
