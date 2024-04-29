/*
 * Crea un programa que comprueba si los paréntesis, llaves y corchetes
 * de una expresión están equilibrados.
 * - Equilibrado significa que estos delimitadores se abren y cieran
 *   en orden y de forma correcta.
 * - Paréntesis, llaves y corchetes son igual de prioritarios.
 *   No hay uno más importante que otro.
 * - Expresión balanceada: { [ a * ( c + d ) ] - 5 }
 * - Expresión no balanceada: { a * ( c + d ) ] - 5 }
 */

function balanceado(expresion) {
  const listaDeExpresiones = {
    "{": "}",
    "(": ")",
    "[": "]",
  };
  let temp = [];
  let resultado = "Expresión balanceada";
  const expresionArray = expresion.split("");
  expresionArray.forEach((caracter) => {
    if (listaDeExpresiones[caracter]) {
      temp.push(caracter);
    } else if (Object.values(listaDeExpresiones).includes(caracter)) {
      if (listaDeExpresiones[temp.pop()] !== caracter) {
        resultado = "Expresión no balanceada";
      }
    }
  });

  if (temp.length > 0) {
    resultado = "Expresión no balanceada";
  }

  console.log(resultado);
}

balanceado("{ [ a * ( c + d ) ] - 5 }");
balanceado("{ a * ( c + d ) ] - 5 }");
