function esPrimo(numero){
    let contador = 0
    for(let i=1; i < 10; i++){
        if(Number.isInteger(numero/i)){
            contador++
        }
    }
    if(contador>2 || numero === 1){
        return false
    } else{
        return true
    }
}

for(let i=1; i<100+1 ;i++){
    if(esPrimo(i)){
        console.log(i)
    }
}