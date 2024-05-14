/*function areaPoligono(poligono,base,altura){
    if (poligono.toLowerCase() === "triangulo" || poligono.toLowerCase() === "triángulo"){
        return (base*altura)/2
    } else if(poligono.toLowerCase() === "cuadrado"){
        return base*altura;
    } else if(poligono.toLowerCase() === "rectangulo" || poligono.toLowerCase() === "rectángulo"){
        return base*altura;
    }
}*/

//Reedicion del codigo
class Poligono{
    constructor(){}
    area(){}
}

class Triángulo extends Poligono{
    constructor(){}
    static area(base, altura){
        this.base = base;
        this.altura = altura;
        return (this.base*this.altura)/2
    }
}

class Cuadrado extends Poligono{
    constructor(){}
    static area(lado){
        this.lado = lado;
        return this.lado*this.lado;
    }
}

class Rectángulo extends Poligono{
    constructor(){}
    static area(base, altura){
        this.base = base;
        this.altura = base;
        return base*altura;
    }
}

function areaPoligono(poligono){
    return poligono
}