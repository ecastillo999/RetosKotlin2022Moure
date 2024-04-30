function filtrar(string1, string2){
    const lista1 = string1.toLowerCase().split("");
    const lista2 = string2.toLowerCase().split("");
    let output = {"out1":"", "out2":""}
    for(caracter in lista1){
        if(!lista2.includes(lista1[caracter])){
            output.out1 += lista1[caracter]
        }
    }
    for(caracter in lista2){
        if(!lista1.includes(lista2[caracter])){
            output.out2 += lista2[caracter]
        }
    }
    return output
}

let output = filtrar("barata", "naranja")
console.log(output.out1, output.out2)

function filtrarEficiente(string1, string2){
    const lista1 = string1.toLowerCase().split("");
    const lista2 = string2.toLowerCase().split("");
    console.log(`Out1: ${lista1.filter(caracter=>!lista2.includes(caracter)).join("")}`)
    console.log(`Out2: ${lista2.filter(caracter=>!lista1.includes(caracter)).join("")}`)
}

filtrarEficiente("barata", "naranja");