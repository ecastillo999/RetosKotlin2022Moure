function enMayuscula(texto){
    let letras = {
        "a": "A",
        "b": "B",
        "c": "C",
        "d": "D",
        "e": "E",
        "f": "F",
        "g": "G",
        "h": "H",
        "i": "I",
        "j": "J",
        "k": "K",
        "l": "L",
        "m": "M",
        "n": "N",
        "ñ": "Ñ",
        "o": "O",
        "p": "P",
        "q": "Q",
        "r": "R",
        "s": "S",
        "t": "T",
        "u": "U",
        "v": "V",
        "w": "W",
        "x": "X",
        "y": "Y",
        "z": "Z",
    }
    let transformado = []
    texto.split(" ").forEach(palabra => {
        if(letras[palabra[0]]){
            palabra = palabra.replace(palabra[0], letras[palabra[0]]);
            transformado.push(palabra)
        }
    });
    console.log(transformado.join(" "))
}

enMayuscula("hola que tal")