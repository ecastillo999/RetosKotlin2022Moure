/*
 * Crea una función que reciba dos cadenas como parámetro (str1, str2)
 * e imprima otras dos cadenas como salida (out1, out2).
 * - out1 contendrá todos los caracteres presentes en la str1 pero NO
 *   estén presentes en str2.
 * - out2 contendrá todos los caracteres presentes en la str2 pero NO
 *   estén presentes en str1.
 */
function encontrarDiferencias(str1, str2) {
  let temp = { out1: "", out2: "" };
  str1 = str1.toLowerCase().split("");
  str2 = str2.toLowerCase().split("");
  str1.forEach((letra) => {
    if (!str2.includes(letra)) {
      temp.out1 += letra;
    }
  });
  str2.forEach((letra) => {
    if (!str1.includes(letra)) {
      temp.out2 += letra;
    }
  });
  return temp;
}
const out = encontrarDiferencias("pato", "palo");

console.log("out 1", out.out1);
console.log("out 2", out.out2);
