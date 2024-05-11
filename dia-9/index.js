/*
 * Crea un programa se encargue de transformar un número
 * decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 */
function convertidorBinario(numero) {
  let almacenador = [];
  while (numero !== 0) {
    let div = Math.floor(numero / 2);
    let residuo = parseInt(numero % 2);
    numero = div;
    almacenador.unshift(residuo);
  }
  return parseInt(almacenador.join(""));
}

console.log(convertidorBinario(450));
