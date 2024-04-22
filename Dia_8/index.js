function contarPalabras(texto){
    let lista = texto.toLowerCase().replace(/[.,;'"()]/g, "").split(" ")

    const acentos = /[á-ú]/g
    let textoNuevo
    
    lista.forEach(element => {
        if(acentos.test(element)){
            textoNuevo = lista.join(" ")
            textoNuevo = textoNuevo.replace(element, "")
            lista = textoNuevo.split(" ").filter(elemento => elemento != "");
        }
    });
    
    const resultado = {}
    lista.forEach(element => {
        let temporal = []
        let idx = lista.indexOf(element)
        while(idx != -1){
            temporal.push(idx)
            idx = lista.indexOf(element, idx+1)
        }
        resultado[element] = temporal.length
    })
    console.table(resultado)
}

contarPalabras("En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor. Una olla de algo más vaca que carnero, salpicón las más noches, duelos y quebrantos los sábados, lentejas los viernes, algún palomino de añadidura los domingos, consumían las tres partes de su hacienda. El resto della concluían sayo de velarte, calzas de velludo para las fiestas, con sus pantuflos de lo mesmo, y los días de entresemana se honraba con su vellorí de lo más fino. Tenía en su casa una ama que pasaba de los cuarenta, y una sobrina que no llegaba a los veinte, y un mozo de campo y plaza, que así ensillaba el rocín como tomaba la podadera.")