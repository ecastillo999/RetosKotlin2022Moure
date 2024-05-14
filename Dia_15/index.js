function esArmstrong(n){
    secuencia = n.toString().split("");
    potencia = n.toString().length
    let resultado = 0;
    for(numeros in secuencia){
        resultado += parseInt(secuencia[numeros])**potencia;
    }
    return n === resultado;
}

console.log(esArmstrong(370))