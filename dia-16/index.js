/*
 * Crea una función que calcule y retorne cuántos días hay entre dos cadenas
 * de texto que representen fechas.
 * - Una cadena de texto que representa una fecha tiene el formato "dd/MM/yyyy".
 * - La función recibirá dos String y retornará un Int.
 * - La diferencia en días será absoluta (no importa el orden de las fechas).
 * - Si una de las dos cadenas de texto no representa una fecha correcta se
 *   lanzará una excepción.
 */

function cuantosDias(fecha1, fecha2) {
  fecha1 = fecha1.split("/");
  fecha2 = fecha2.split("/");

  const dfecha1 = new Date(fecha1[2], fecha1[1], fecha1[0]);
  const dfecha2 = new Date(fecha2[2], fecha2[1], fecha2[0]);

  if (isNaN(dfecha1) || isNaN(dfecha2)) {
    throw new Error("Una de las fechas no es válida.");
  }
  const diffEnMs = Math.abs(dfecha1 - dfecha2);
  const diffEnDias = Math.ceil(diffEnMs / (1000 * 60 * 60 * 24));
  return diffEnDias;
}

console.log(cuantosDias("30/06/2002", "20/06/2002"));
