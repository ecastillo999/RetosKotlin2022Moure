package com.mouredev.weeklychallenge2022

/*
 * Reto #46
 * ¿DÓNDE ESTÁ EL ROBOT?
 * Fecha publicación enunciado: 14/10/22
 * Fecha publicación resolución: 21/11/22
 * Dificultad: MEDIA
 *
 * Enunciado: Calcula dónde estará un robot (sus coordenadas finales) que se encuentra en una cudrícula
 * representada por los ejes "x" e "y".
 * - El robot comienza en la coordenada (0, 0).
 * - Para idicarle que se mueva, le enviamos un array formado por enteros (positivos o negativos)
 *   que indican la secuencia de pasos a dar.
 *  - Por ejemplo: [10, 5, -2] indica que primero se mueve 10 pasos, se detiene, luego 5, se detiene,
 *    y finalmente 2. El resultado en este caso sería (x: -5, y: 12)
 * - Si el número de pasos es negativo, se desplazaría en sentido contrario al que está mirando.
 * - Los primeros pasos los hace en el eje "y". Interpretamos que está mirando hacia la parte
 *   positiva del eje "y".
 * - El robot tiene un fallo en su programación: cada vez que finaliza una secuencia de pasos gira
 *   90 grados en el sentido contrario a las agujas del reloj.
 *
 * Información adicional:
 * - Usa el canal de nuestro Discord (https://mouredev.com/discord) "🔁reto-semanal"
 *   para preguntas, dudas o prestar ayuda a la comunidad.
 * - Tienes toda la información sobre los retos semanales en
 *   https://retosdeprogramacion.com/semanales2022.
 *
 */

import kotlin.math.sin
import kotlin.math.cos
import kotlin.math.PI
import kotlin.math.roundToInt

fun main() {
    val startDegrees = 90.00
    val rotationDegrees = 90.00
    
    val steps = listOf(10, 5, -2)    
    
    val finalPosition = moveRobot(startDegrees, rotationDegrees, steps)
    
    println("Posicion final: $finalPosition")
}

fun moveRobot(startDegrees: Double, rotationDegrees: Double, steps: List<Int>): Pair<Double, Double> {
    var (x, y) = Pair(0.0, 0.0)
    
    var rotationRadian = startDegrees * (PI/180)            
    var (x1, y1) = Pair(cos(rotationRadian), sin(rotationRadian))        
    
    steps.forEach { step ->                                     
        x += x1 * step
        y += y1 * step
        
        rotationRadian += rotationDegrees * (PI/180)                
        
        x1 = cos(rotationRadian)
        y1 = sin(rotationRadian) 
    }        
    
    return Pair((x * 100.0).roundToInt() / 100.0, (y*100.0).roundToInt() /100.0)
}