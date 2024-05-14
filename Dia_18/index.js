function carreraSuperada(pista, array){
    if(!array.every(accion => accion === "run" | accion === "jump")){
        throw new Error("Acciones incorrectas").message;
    }
    if(!pista.split("").every(tramo => tramo === "_" | tramo === "|")){
        throw new Error("Pista incorrecta").message;
    }
    if(pista.split("").length != array.length){
        throw new Error("El tamaño de la pista no coincide con el numero de acciones").message
    }
    let resultado = ""
    for(index in array){
        if(pista[index] === "_" & array[index] === "jump"){
            resultado += "x"
        } else if(pista[index] === "|" & array[index] === "run"){
            resultado += "/"
        }else{
            resultado += pista[index]
        }
    }
    console.log(resultado)
    return resultado.split("").every(tramo => tramo === "_" | tramo === "|")
}

console.log(carreraSuperada("_|__|", ["run","jump","run","run","jump"]))