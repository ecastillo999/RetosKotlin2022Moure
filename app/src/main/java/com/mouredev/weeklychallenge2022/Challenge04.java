package com.mouredev.weeklychallenge2022;

import javax.swing.JOptionPane;

/*
fun main() {

    area(Triangle(10.0, 5.0))
    area(Rectangle(5.0, 7.0))
    area(Square(4.0))
}

interface Polygon {

    fun area(): Double
    fun printArea()
}

data class Triangle(val base: Double, val height: Double): Polygon {

    override fun area(): Double {
        return (base * height) / 2
    }

    override fun printArea() {
        println("El área del triángulo es ${area()}")
    }
}

data class Rectangle(val length: Double, val width: Double): Polygon {

    override fun area(): Double {
        return length * width
    }

    override fun printArea() {
        println("El área del rectángulo es ${area()}")
    }
}

data class Square(val side: Double): Polygon {

    override fun area(): Double {
        return side * side
    }

    override fun printArea() {
        println("El área del cuadrado es ${area()}")
    }
}

private fun area(polygon: Polygon): Double {
    polygon.printArea()
    return polygon.area()
}


 * Reto #4
 * ÁREA DE UN POLÍGONO
 * Fecha publicación enunciado: 24/01/22
 * Fecha publicación resolución: 31/01/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
public class Challenge04{
	private static int numeroLados;
	private static double area, base, altura;
	public static void main(String[] args) {
		System.out.println(calculaArea());
	}
	public static String calculaArea (){
		numeroLados=Integer.parseInt(JOptionPane.showInputDialog("How many sides your poligon have?"));
		base=Double.parseDouble(JOptionPane.showInputDialog("Specify the base of your polygon:"));
		altura=Double.parseDouble(JOptionPane.showInputDialog("Specify the height of your polygon:"));
		String poligono="";
		if(numeroLados < 3 ||numeroLados > 4) {
			return"The polygon you are trying to calculate is not suported by this function.\n Please enter either a triangle a square or a rectangle";
		}else 
		if (numeroLados == 3) {
			area=(base*altura)/2;
			poligono="triangle";
		}else
		if (numeroLados == 4 && base==altura) {
			area=(base*altura);
			poligono="square";
		}else
		if(numeroLados == 4 && base!=altura) {
			area=(base*altura);
			poligono="rectangle";
		}
		
			return "Your "+poligono+" area equals "+Double.toString(area)+" square units.";
	}
}