///* Reto #11
// * ELIMINANDO CARACTERES
// * Fecha publicaci�n enunciado: 14/03/22
// * Fecha publicaci�n resoluci�n: 21/03/22
// * Dificultad: F�CIL
// *
// * Enunciado: Crea una funci�n que reciba dos cadenas como par�metro (str1, str2) e imprima otras dos cadenas como salida (out1, out2).
// * - out1 contendr� todos los caracteres presentes en la str1 pero NO est�n presentes en str2.
// * - out2 contendr� todos los caracteres presentes en la str2 pero NO est�n presentes en str1.

public class Semana11 {

	public static void main(String[] args) {

		String str1 = "hoLa";
		String str2 = "ladOs";

		eliminandoCaracteres(str1, str2);

	}

	public static void eliminandoCaracteres(String str1, String str2) {

		String aux1 = str1.toLowerCase();
		String aux2 = str2.toLowerCase();
		String out1 = "";
		String out2 = "";

		for (int i = 0; i < aux1.length(); i++) {

			String salida = String.valueOf(aux1.charAt(i));

			if (!aux2.contains(salida)) {

				out1 = out1.concat(salida);

			}

		}

		for (int i = 0; i < aux2.length(); i++) {

			String salida = String.valueOf(aux2.charAt(i));

			if (!aux1.contains(salida)) {

				out2 = out2.concat(salida);

			}

		}

		System.out.println(out1);
		System.out.println(out2);

	}

}
