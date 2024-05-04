function calcularDia(fecha1, fecha2){
    fecha1 = fecha1.split("/")
    fecha2 = fecha2.split("/")
    //Reorganizamos la fecha al formato que acepta Date
    fecha1 = new Date(`${fecha1[1]}/${fecha1[0]}/${fecha1[2]}`)
    fecha2 = new Date(`${fecha2[1]}/${fecha2[0]}/${fecha2[2]}`)
    //Evaluamos si el formato es aceptable
    if(isNaN(fecha1) | isNaN(fecha2)){
        throw new Error("El formato de la fecha es incorrecto.")
    }
    //calculamos el valor de un dia en milisegundos y lo dividimos
    const dia = 24*60*60*1000;
    return Math.ceil(Math.abs((fecha1 - fecha2)) / dia);
}

console.log(calcularDia("07/03/2022", "07/03/2023"))
//console.log(calcularDia("07/50/2022", "07/03/2023")) <-- Fecha errada, retorna error.