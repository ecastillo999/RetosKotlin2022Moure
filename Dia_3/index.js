function sucesionFibonacci(){
    let sucesion1 = 0
    let sucesion2 = 1
    let fibonacci = 0
    for(let i = 0; i < 50; i++){
        console.log(fibonacci)
        sucesion1 = sucesion2
        sucesion2 = fibonacci
        fibonacci = sucesion1 + sucesion2
    }
}

sucesionFibonacci()