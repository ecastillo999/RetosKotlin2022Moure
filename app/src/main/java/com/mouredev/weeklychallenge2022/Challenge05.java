package com.mouredev.weeklychallenge2022;


import java.awt.image.*;
import java.io.*;
import java.net.*;

import javax.imageio.*;
import javax.swing.JOptionPane;
/*
class Challenge5() {
	
	fun aspectRatio(url: String) {
		
		Thread {
			var aspectRationStr: String? = null
					
					val url = URL(url)
					val bitmap = BitmapFactory.decodeStream(url.openStream())
					
					val height = bitmap.height
					val width = bitmap.width
					val aspectRatio = rationalAspectRatio(height.toDouble() / width.toDouble())
					aspectRationStr = "${aspectRatio.second}:${aspectRatio.first}"
					
					aspectRationStr?.let { ratio ->
					println("El aspect ratio es ${ratio}")
			} ?: run {
				println("No se ha podido calcular el aspect ratio")
			}
		}.start()
	}
	
	data class Quadruple(val h1: Int, val k1: Int, val h: Int, val k: Int)
	
	private fun rationalAspectRatio(aspectRatio: Double): Pair<Int, Int> {
		val precision = 1.0E-6
				var x = aspectRatio
				var a = x.roundToInt()
				var q = Quadruple(1, 0, a, 1)
				
				while (x - a > precision * q.k.toDouble() * q.k.toDouble()) {
					x = 1.0 / (x - a)
							a = x.roundToInt()
							q = Quadruple(q.h, q.k, q.h1 + a * q.h, q.k1 + a * q.k)
				}
		return Pair(q.h, q.k)
	}
	
}

 * Reto #5
 * ASPECT RATIO DE UNA IMAGEN
 * Fecha publicación enunciado: 01/02/22
 * Fecha publicación resolución: 07/02/22
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Crea un programa que se encargue de calcular el aspect ratio de una imagen a partir de una url.
 * - Nota: Esta prueba no se puede resolver con el playground online de Kotlin. Se necesita Android Studio.
 * - Url de ejemplo: https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png
 * - Por ratio hacemos referencia por ejemplo a los "16:9" de una imagen de 1920*1080px.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
public class Challenge05{
	public static void main ( String[] args) {
		BufferedImage miImagen = null;
		try{
			URL imagenExterna = new URL(JOptionPane.showInputDialog("Introduzca la dirección URL de la imagen que desea calcular"));
			miImagen =  ImageIO.read(imagenExterna);			
			System.out.println("El aspect ratio de la imagen es: "+( miImagen.getWidth() / mcd( miImagen.getWidth(), miImagen.getHeight()) )+":"+( miImagen.getHeight() / mcd( miImagen.getWidth(), miImagen.getHeight()) ));
			
		}catch(IOException ex) {
			System.out.println(ex.getCause());
			System.out.println(ex.getLocalizedMessage());
		}
	}

	public static int mcd(int a, int b) {
		if (b == 0) return a;
		return mcd( b , a%b );
	}
}
/*
			do{
				mcd = alto;
				alto = ancho % alto;
				ancho =mcd;
			}while(alto != 0);
			ancho=miImagen.getWidth();
			alto=miImagen.getHeight();
 */