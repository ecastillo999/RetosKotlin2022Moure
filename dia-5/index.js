
/*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */

function polígono() {
    function triangulo(base, alto) {
        return (base * alto) / 2;
    }
    function rectangulo(long, ancho) {
        return long * ancho;
    }
    function cuadrado(lado) {
        return lado * lado;
    }
    return { triangulo, rectangulo, cuadrado }
}

const { triangulo, rectangulo, cuadrado } = polígono()

console.log('triangulo', triangulo(10, 5))
console.log('rectangulo', rectangulo(5, 7))
console.log('cuadrado', cuadrado(4))