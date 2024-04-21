function darVuelta(string){
    let stringInverso = ""
    for(let i = string.length; i != 0; i--){
        stringInverso = stringInverso + string[i-1]
    }
    console.log(stringInverso)
}