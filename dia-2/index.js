/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */


function anagrama(palabra1, palabra2) {
    if (palabra1 === palabra2) return false;
    const p1 = palabra1.split('').sort().toString()
    const p2 = palabra2.split('').sort().toString()
   return p1 === p2
}

console.log('anagrama V2:', anagrama('animales', 'milanesa'))



    //////////////////////////
    //    Primera version   //
    //////////////////////////

function anagramav1(palabra1, palabra2) {
    if (palabra1 === palabra2) return false;
    if (palabra1.length !== palabra2.length) return false;
    let considencias = [];
    const p1 = palabra1.split('').sort()
    const p2 = palabra2.split('').sort()
   for (let i = 0; i < palabra1.length; i++) {
    considencias.push(p1[i]===p2[i])
   }
   return !considencias.includes(false)
}

console.log('anagrama V1:', anagramav1('lobo', 'bolo'))

