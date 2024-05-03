/*
 * Escribe una función que calcule si un número dado es un número de Armstrong
 * (o también llamado narcisista).
 * Si no conoces qué es un número de Armstrong, debes buscar información
 * al respecto.
 */

function esNumeroArmstrong(numero) {
  const numString = numero.toString();
  let suma = 0;
  for (let i = 0; i < numString.length; i++) {
    const digito = parseInt(numString[i]);
    suma += Math.pow(digito, numString.length);
  }

  if (suma === numero) {
    console.log(numero + " es un número de Armstrong.");
  } else {
    console.log(numero + " no es un número de Armstrong.");
  }
}
// es una número de Armstrong
esNumeroArmstrong(153);
// no es un número de Armstrong
esNumeroArmstrong(123);
