package com.mouredev.weeklychallenge2022

/*
 * Reto #34
 * LOS NÚMEROS PERDIDOS
 * Fecha publicación enunciado: 22/08/22
 * Fecha publicación resolución: 29/08/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Dado un array de enteros ordenado y sin repetidos, crea una función que calcule
 * y retorne todos los que faltan entre el mayor y el menor.
 * - Lanza un error si el array de entrada no es correcto.
 *
 * Información adicional:
 * - Usa el canal de nuestro Discord (https://mouredev.com/discord) "🔁reto-semanal"
 *   para preguntas, dudas o prestar ayuda a la comunidad.
 * - Tienes toda la información sobre los retos semanales en
 *   https://retosdeprogramacion.com/semanales2022.
 *
 */

 const arr = [1,4,5,6,9,12,17];

const recorrer = (item, index, arr) =>{
   if( index === (arr.length - 1) ) return;

   const nextItem = arr[index + 1];
   if( (nextItem - item) === 1 ) return;

   const missingNumbersInCurrentStep = []
   while( ++item < nextItem ){
      missingNumbersInCurrentStep.push(item);
   }

   return missingNumbersInCurrentStep;
}

const getMissingNumber = ( arr ) => {
    const numbers = [... arr];
    return numbers.map( recorrer ).filter(item => item !== undefined).flat();
}

const missingNumber = getMissingNumber(arr)

console.log(missingNumber)

