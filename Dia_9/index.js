function decimalBinario(decimal){
    let cociente = parseInt(decimal/2)
    let resto = parseInt(decimal%2)
    let resultado = []
    resultado.push(resto)
    while(cociente != 1){
        console.log("resto",resto)
        resto = parseInt(cociente%2);
        resultado.unshift(resto)
        console.log("cociente:",cociente)
        cociente = parseInt(cociente/2);
    }
    console.log("cociente",cociente)
    resultado.unshift(cociente)
    resultado = parseInt(resultado.join(""))
    console.log(resultado)
}

decimalBinario(450)