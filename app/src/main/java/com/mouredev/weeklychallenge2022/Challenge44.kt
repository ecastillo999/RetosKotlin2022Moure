package retos_MouDev;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Reto #44
 * BUMERANES
 * Fecha publicación enunciado: 02/10/22
 * Fecha publicación resolución: 07/11/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que retorne el número total de bumeranes de un array de números
 * enteros e imprima cada uno de ellos.
 * - Un bumerán (búmeran, boomerang) es una secuencia formada por 3 números seguidos, en el que el
 *   primero y el último son iguales, y el segundo es diferente. Por ejemplo [2, 1, 2].
 * - En el array [2, 1, 2, 3, 3, 4, 2, 4] hay 2 bumeranes ([2, 1, 2] y [4, 2, 4]).
 *
 * Información adicional:
 * - Usa el canal de nuestro Discord (https://mouredev.com/discord) "🔁reto-semanal"
 *   para preguntas, dudas o prestar ayuda a la comunidad.
 * - Tienes toda la información sobre los retos semanales en
 *   https://retosdeprogramacion.com/semanales2022.
 *
 */

public class Reto44 {

	public static void main(String... args) {
		new Boomerang();
	}

	private static  class Boomerang {

		private Boomerang() {
			findBoomerang();
			imprimeResultado();
		}

		private final int[] SECUENCIA = { 2, 1, 2, 3, 3, 4, 2, 4 };
		private int countBoomerang = 0;
		private ArrayList<int[]> boomerang = new ArrayList<int[]>();

		private void findBoomerang() {
			for (int i = 0; i < SECUENCIA.length - 2; i++) {
				if (SECUENCIA[i] != SECUENCIA[i + 1] && SECUENCIA[i] == SECUENCIA[i + 2]) {
					int[] auxBoomerang = { SECUENCIA[i], SECUENCIA[i + 1], SECUENCIA[i + 2] };
					boomerang.add(auxBoomerang);
					countBoomerang++;
				}
			}
		}

		private void imprimeResultado() {
			System.out.println("En el array " + Arrays.toString(SECUENCIA) + " hay " + countBoomerang + " bumeranes:");
			for (int[] auxArray : boomerang) {
				System.out.println(Arrays.toString(auxArray));
			}
		}

	}
}