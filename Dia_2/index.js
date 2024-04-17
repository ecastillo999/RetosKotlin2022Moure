function esAnagrama(string1, string2){
    if(string1 !== string2){
        if(string1.length === string2.length){
            let lista1 = string1.split("")
            let lista2 = string2.split("")
            for(let i = 0; i < lista1.length; i++){
                let filtro1 = lista1.find(letra => letra === lista1[i])
                let filtro2 = lista2.find(letra => letra === lista1[i])
                if(filtro2 == undefined){
                    return false
                } else if(filtro1.length !== filtro2.length){
                    return false
                }
            }
            return true

        } else {
            return false
        }
    } else {
        return false
    }
}

console.log(esAnagrama("botines","bisonte"))

//solucion eficiente

function esAnagramaV2(string1, string2){
    if(string1 != string2){
        const lista1 = string1.toLowerCase().split("").sort()
        const lista2 = string2.toLowerCase().split("").sort()
        return lista1.toString() === lista2.toString()
    } else {
        return false
    }
}

console.log(esAnagramaV2("botines","bisonte"))