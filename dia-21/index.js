/*
 * Crea una función que sume 2 números y retorne su resultado pasados
 * unos segundos.
 * - Recibirá por parámetros los 2 números a sumar y los segundos que
 *   debe tardar en finalizar su ejecución.
 * - Si el lenguaje lo soporta, deberá retornar el resultado de forma
 *   asíncrona, es decir, sin detener la ejecución del programa principal.
 *   Se podría ejecutar varias veces al mismo tiempo.
 */

async function sumarConTiempo(num1, num2, segundos) {
  return new Promise((resolve) =>
    setTimeout(() => resolve(num1 + num2), segundos * 1000)
  );
}
const llamada1 = sumarConTiempo(1, 1, 5);
const llamada2 = sumarConTiempo(2, 3, 3);
const llamada3 = sumarConTiempo(7, 2, 2);

Promise.all([llamada1, llamada2, llamada3]).then((resultados) => {
  console.log(resultados);
});
