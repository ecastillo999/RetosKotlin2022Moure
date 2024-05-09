/*
 * Crea una función que reciba días, horas, minutos y segundos (como enteros)
 * y retorne su resultado en milisegundos.
 */

function convertirAMilisegundos(dias, horas, minutos, segundos) {
  return (
    dias * 24 * 60 * 60 * 1000 +
    horas * 60 * 60 * 1000 +
    minutos * 60 * 1000 +
    segundos * 1000
  );
}

console.log(convertirAMilisegundos(2, 5, 7, 8));
