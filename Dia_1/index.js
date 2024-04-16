function mensajeBievenida(){
    console.log("Hola, bienvenido")
}

function suma(numero1, numero2){
    console.log("La suma entre "+numero1+" y "+numero2+" es "+(numero1+numero2))
}

function multiplicacion(numero1, numero2){
    return numero1 * numero2
}

numeroString = "5"
parseInt(numeroString)

variableGlobal = "hola"
function prueba(){
    console.log(variableGlobal)
    let variableLocal = "adios"
}
// console.log(variableLocal) imposible de ejecutar

function dificultadExtra(string1, string2){
    let cuenta = 0
    for(let contador = 1; contador < 100+1; contador++){
        if(contador % 3 == 0 && contador % 5 == 0){
            console.log(string1+string2)
        } else if(contador % 3 == 0){
            console.log(string1)
        } else if(contador % 5 == 0){
            console.log(string2)
        } else{
            console.log(contador)
            cuenta++
        }
    }
    return cuenta;
}

console.log(dificultadExtra("perro","perkin"))