/*
 * Escribe una función que reciba un texto y retorne verdadero o
 * falso (Boolean) según sean o no palíndromos.
 * Un Palíndromo es una palabra o expresión que es igual si se lee
 * de izquierda a derecha que de derecha a izquierda.
 * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
 * Ejemplo: Ana lleva al oso la avellana.
 */

function esPalindromo(texto) {
  const textoLimpio = texto
    .replace(/[.,\/#!$%\^&\*;:{}=\-_`~()\s]/g, "")
    .toLowerCase();
  let textoAlreves = [];
  textoLimpio.split("").forEach((letra) => {
    textoAlreves.unshift(letra);
  });
  return textoLimpio === textoAlreves.join("");
}
// Si es un palindromo
console.log(esPalindromo("Ana lleva al oso la avellana."));
// No es un palindromo
console.log(
  esPalindromo(
    "Las vacas pueden comunicarse entre ellas utilizando un lenguaje secreto"
  )
);
