/*
 * Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */


////////////////////////////////
//      Forma enrevesada      //
////////////////////////////////
function invertirTexto(texto) {
    const convertirArray = texto.split("")
    let arrayInvertido = [];
    convertirArray.forEach(letra => {
        arrayInvertido.unshift(letra)
    });

    return arrayInvertido.join('');
}

console.log(invertirTexto('Hola Mundo'))


////////////////////////////////
//       Forma simple         //
////////////////////////////////
function invertirTextoSimple(texto) {
    return texto.split("").reverse().join('');
}

console.log(invertirTextoSimple('Hola Mundo'))