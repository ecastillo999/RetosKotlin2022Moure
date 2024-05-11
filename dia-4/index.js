/*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */

function primo(numero) {
    if (numero <= 1) {
        return;
    }
    let esPrimo = true;
    for (let i = 2; i * i <= numero; i++) {
        if (numero % i === 0) {
            esPrimo = false;
            break;
        }
    }
    if (esPrimo) {
        console.log(numero);
    }
}

for (let numero = 1; numero <= 100; numero++) {
    primo(numero);
}
