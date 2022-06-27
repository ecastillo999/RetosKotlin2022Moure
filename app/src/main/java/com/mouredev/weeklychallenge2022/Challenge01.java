package com.mouredev.weeklychallenge2022;

import javax.swing.JOptionPane;
import java.util.*;

/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Fecha publicación enunciado: 03/01/22
 * Fecha publicación resolución: 10/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 *

fun main() {
    println(isAnagram("amor", "roma"))
}

private fun isAnagram(wordOne: String, wordTwo: String): Boolean {
    if (wordOne.lowercase() == wordTwo.lowercase()) {
        return false
    }
    return wordOne.lowercase().toCharArray().sortedArray().contentEquals(wordTwo.lowercase().toCharArray().sortedArray())
}
*/
public class Challenge01{

	String palabraUno, palabraDos;
	
	public static void main(String[] args) {
				new Challenge01();
	}

public Challenge01() {
		System.out.println(comparador(JOptionPane.showInputDialog("¿Cuál es el primer texto?"), JOptionPane.showInputDialog("¿Cuál es el segundo texto?")));
	}
public String comparador (String palabraUno, String palabraDos) {
	this.palabraUno=palabraUno;
	this.palabraDos=palabraDos;
	
	if(palabraUno.equalsIgnoreCase(palabraDos) || comparaCaracteres() == false) {
		return "Las palabras introducidas no son un anagrama";
	}return "Las palabras introducidas son un anagrama";
}
public boolean comparaCaracteres() {
	char[] wordOne = palabraUno.toLowerCase().strip().toCharArray();
	char[] wordTwo = palabraDos.toLowerCase().strip().toCharArray();
	
	Arrays.sort(wordOne);
	Arrays.sort(wordTwo);
	if (Arrays.compare(wordOne, wordTwo) == 0) {
		return true;
	}return false;
}
}
