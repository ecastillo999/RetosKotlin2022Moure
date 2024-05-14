function evaluarLista(lista){
    let lineaX = []
    let lineaO = []
    for(elemento in lista){
        if(lista[elemento].every(valor => valor === "X")){
            lineaX.push(lista[elemento].join(""))
        }else if(lista[elemento].every(valor => valor === "O")){
            lineaO.push(lista[elemento].join(""))
        }
    }
    if(lineaO.length > lineaX.length){
        return "O"
    } else if(lineaX.length > lineaO.length){
        return "X"
    } else if(lineaO.length === 0 & lineaX.length === 0){
        return "Empate"
    } else{
        return "Nulo"
    }
}

function columnas(columnas){
    let columnasLista = []
    for(i = 0; i != 3; i++){
        let temporal = []
        for(index in columnas){
            temporal.push(columnas[index][i])
        }
        columnasLista.push(temporal)
    }
    return evaluarLista(columnasLista)
}

function diagonales(diagonales){
    let diagonalesLista = []
    let temporal = []
    for(i = 0; i != 3; i++){
        temporal.push(diagonales[i][i])
    }
    diagonalesLista.push(temporal)
    temporal = []
    let index = 0
    for(i = 2; i >= 0; i--){
        temporal.push(diagonales[index][i])
        index++
    }
    diagonalesLista.push(temporal)
    return evaluarLista(diagonalesLista)
}

function tresEnRaya(lineas){
    for(linea in lineas){
        if(lineas[linea].length != 3){
            throw new Error("Nulo").message
        }
    }
    const resultado = [evaluarLista(lineas), columnas(lineas), diagonales(lineas)]
    const boolean = valor => resultado[valor] === "X" | resultado[valor] === "O"
    if(resultado.every(valor => valor === "Empate")){
        return "Empate"
    } else if(resultado.includes("Nulo")){
        return "Nulo"
    }else if(boolean(2)){
        return resultado[2]
    }else if(boolean(0)){
        return resultado[0]
    }else if(boolean(1)){
        return resultado[1]
    }
}

console.log(tresEnRaya([
    [ 'X', 'O', 'O' ],
    [ 'O', 'O', 'X' ],
    [ 'O', 'X', 'X' ]
]))