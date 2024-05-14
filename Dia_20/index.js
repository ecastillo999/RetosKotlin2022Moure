function conversorDeTiempo(dias,horas,minutos,segundos){
    return (((dias*24 + horas)*60 + minutos)*60 + segundos)*1000
}

console.log(conversorDeTiempo(1,5,30,20))