// * Reto #10
// * EXPRESIONES EQUILIBRADAS
// * Fecha publicaci�n enunciado: 07/03/22
// * Fecha publicaci�n resoluci�n: 14/03/22
// * Dificultad: MEDIA
// *
// * Enunciado: Crea un programa que comprueba si los par�ntesis, llaves y corchetes de una expresi�n est�n equilibrados.
// * - Equilibrado significa que estos delimitadores se abren y cieran en orden y de forma correcta.
// * - Par�ntesis, llaves y corchetes son igual de prioritarios. No hay uno m�s importante que otro.
// * - Expresi�n balanceada: { [ a * ( c + d ) ] - 5 }
// * - Expresi�n no balanceada: { a * ( c + d ) ] - 5 }

import java.util.*;

public class Week10 {

	public static void main(String[] args) {

		String cadena = "{ a * ( c + d ) ] - 5 }";

		if (cadenaBalanceada(cadena)) {

			System.out.println("Cadena balanceada.");

		} else {

			System.out.println("Cadena NO balanceada.");

		}

	}

	public static boolean cadenaBalanceada(String cadena) {

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < cadena.length(); i++) {

			if (cadena.charAt(i) == '{' || cadena.charAt(i) == '[' || cadena.charAt(i) == '(') {

				stack.push(cadena.charAt(i));

			} else if (cadena.charAt(i) == '}' || cadena.charAt(i) == ']' || cadena.charAt(i) == ')') {

				if (stack.empty()) {

					return false;

				} else if (stack.peek() == '{' || stack.peek() == '[' || stack.peek() == '(') {

					stack.pop();

				}

			}

		}

		return stack.empty();

	}

}