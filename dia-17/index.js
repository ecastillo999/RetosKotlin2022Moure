function enMayusculas(texto) {
    texto = texto.split(' ')
    let resultado=[]
    texto.forEach(palabra => {
        resultado.push(palabra[0].toUpperCase() + palabra.slice(1))
    });
    return resultado.join(' ');
}

console.log(enMayusculas('en un pequeño pueblo rodeado de montañas, vivía un joven llamado mateo.'))