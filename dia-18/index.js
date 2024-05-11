/*
 * Crea una función que evalúe si un/a atleta ha superado correctamente una
 * carrera de obstáculos.
 * - La función recibirá dos parámetros:
 *      - Un array que sólo puede contener String con las palabras
 *        "run" o "jump"
 *      - Un String que represente la pista y sólo puede contener "_" (suelo)
 *        o "|" (valla)
 * - La función imprimirá cómo ha finalizado la carrera:
 *      - Si el/a atleta hace "run" en "_" (suelo) y "jump" en "|" (valla)
 *        será correcto y no variará el símbolo de esa parte de la pista.
 *      - Si hace "jump" en "_" (suelo), se variará la pista por "x".
 *      - Si hace "run" en "|" (valla), se variará la pista por "/".
 * - La función retornará un Boolean que indique si ha superado la carrera.
 * Para ello tiene que realizar la opción correcta en cada tramo de la pista.
 */

function carrera(movimientos, pista) {
  let pistaArray = pista.split("");

  if (movimientos.length !== pistaArray.length) {
    console.log("Longitudes de movimientos y pista no coinciden.");
    return false;
  }

  for (let i = 0; i < movimientos.length; i++) {
    if (pistaArray[i] === "|" && movimientos[i] === "run") {
      pistaArray[i] = "/";
    } else if (pistaArray[i] === "_" && movimientos[i] === "jump") {
      pistaArray[i] = "x";
    }
  }

  console.log("Pista después de la carrera: " + pistaArray.join(""));

  if (pistaArray.includes("x") || pistaArray.includes("/")) {
    return false;
  } else {
    return true;
  }
}

console.log(carrera(["run", "jump", "run", "jump", "run"], "_|_|_"));
console.log(carrera(["run", "run", "run", "jump", "run"], "_|_|_"));
console.log(carrera(["run", "run", "jump", "jump", "run"], "_|_|_"));
