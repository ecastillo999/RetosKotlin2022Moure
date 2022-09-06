//solucion reto #0
//mode: easy xD

// * Enunciado: Escribe un programa que muestre por consola (con un print) los números de 1 a 100 (ambos incluidos y con un salto de línea entre cada impresión), sustituyendo los siguientes:
//  * - Múltiplos de 3 por la palabra "fizz".
//  * - Múltiplos de 5 por la palabra "buzz".
//  * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".

const main = ():void => {
    
    let index:number = 0;
    for (index; index <= 100; index++) {

        let isDivisionbyThree:boolean = index % 3 === 0;
        let isDivisionByFive:boolean = index % 5 === 0;

        if (isDivisionbyThree && isDivisionByFive) {
            console.log('fizzbuzz', index);
        }

        if ( isDivisionByFive ) {
            console.log('buzz');
        }

        if ( isDivisionbyThree ) {
            console.log('fizz');
        }

    }
};

main();

// big(0) time Complexity = 0(1)
// big(0) space Complexity = 0(1)