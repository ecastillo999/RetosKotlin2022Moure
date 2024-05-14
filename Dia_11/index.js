function esEquilibrada(expresion){
    const simbolos = {"{": "}", "[": "]", "(": ")"};
    let lista = [];
    let index = 0;
    for(let i = expresion.length; i != 0; i--){
        if(simbolos[expresion.split("")[index]]){
            lista.push(expresion.split("")[index])
        } else if(Object.values(simbolos).includes(expresion.split("")[index])){
            if(lista.length === 0 || expresion.split("")[index] != simbolos[lista.pop(expresion.split("")[index])]){
                console.log("La expresion no está equilibrada")
                return false
            }
        }
        index++
    };
    console.log("La expresion está equilibrada")
    return lista.length == 0;
}

esEquilibrada("{ [ a * ( c + d ) ] - 5 }")
esEquilibrada("{ a * ( c + d ) ] - 5 }")
