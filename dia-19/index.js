/*
 * Crea una función que analice una matriz 3x3 compuesta por "X" y "O"
 * y retorne lo siguiente:
 * - "X" si han ganado las "X"
 * - "O" si han ganado los "O"
 * - "Empate" si ha habido un empate
 * - "Nulo" si la proporción de "X", de "O", o de la matriz no es correcta.
 *   O si han ganado los 2.
 * Nota: La matriz puede no estar totalmente cubierta.
 * Se podría representar con un vacío "", por ejemplo.
 */

function tresEnRaya(matriz) {
  const matrizArray = [...matriz[0], ...matriz[1], ...matriz[2]];
  if (
    matriz[0].length !== 3 ||
    matriz[1].length !== 3 ||
    matriz[2].length !== 3
  ) {
    return "Nulo";
  }

  const combinacionesGanadoras = [
    [0, 1, 2],
    [3, 4, 5],
    [6, 7, 8],
    [0, 3, 6],
    [1, 4, 7],
    [2, 5, 8],
    [0, 4, 8],
    [2, 4, 6],
  ];
  let resultado = [];
  combinacionesGanadoras.forEach((combinacion) => {
    const [a, b, c] = combinacion;
    if (
      matrizArray[a] !== " " &&
      matrizArray[a] === matrizArray[b] &&
      matrizArray[a] === matrizArray[c]
    ) {
      resultado.push(matrizArray[a]);
    }
  });
  if (resultado.includes("x") && resultado.includes("o")) {
    return "Nulo";
  } else if (resultado[0]) {
    return resultado[0];
  } else {
    return "Empate";
  }
}

console.log(
  "Gana:",
  tresEnRaya([
    ["x", "x", "o"],
    ["x", "o", " "],
    ["o", " ", " "],
  ])
);
console.log(
  "Gana:",
  tresEnRaya([
    [" ", "o", "o"],
    ["x", "x", "x"],
    ["0", "x", "o"],
  ])
);
console.log(
  "Ambos ganan:",
  tresEnRaya([
    ["x", "x", "o"],
    ["x", "x", "o"],
    ["o", "x", "o"],
  ])
);
console.log(
  "Ningúno gana:",
  tresEnRaya([
    ["x", "o", "o"],
    ["o", "x", "x"],
    ["x", "x", "o"],
  ])
);
