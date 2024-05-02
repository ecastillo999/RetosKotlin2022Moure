function esPalidromo(texto){
    texto = texto.replace(/[ -,-.]/g, "").toLowerCase();
    texto = texto.normalize("NFD").replace(/[\u0300-\u036f]/g, "")
    let index = texto.length
    for(caracter in texto){
        if(texto[caracter] !== texto[index-1]){
            console.log(texto[caracter],"=",texto[index-1])
            return false
        }
        index--
    }
    return true;
}

console.log(esPalidromo("Ana lleva al oso la avellana."))
console.log(esPalidromo("Ella, te dará detalle."))